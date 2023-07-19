package co.psyke.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.entitites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}
