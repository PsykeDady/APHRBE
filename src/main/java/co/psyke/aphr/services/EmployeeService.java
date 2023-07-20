package co.psyke.aphr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.aphr.entitites.Employee;
import co.psyke.aphr.repositories.EmployeeRepository;

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
		if(employeeRepository.findById(e.getId()).isEmpty()){
			throw new IllegalArgumentException("Employee not found");
		}
		employeeRepository.save(e); 
	}
}
