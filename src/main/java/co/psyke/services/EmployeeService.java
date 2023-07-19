package co.psyke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.entitites.Employee;
import co.psyke.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;


	public void addEmployee (Employee e){
		employeeRepository.save(e);
	}

	public void deleteEmployee (Employee e){
		employeeRepository.delete(e);
	}

	public Employee getEmployeeById(Long id){
		return employeeRepository.findById(id).orElse(null);
	}

	public void editEmployeeById(Employee e){
		employeeRepository.save(e); 
	}
}
