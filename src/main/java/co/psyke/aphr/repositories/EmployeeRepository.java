package co.psyke.aphr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.aphr.entitites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}
