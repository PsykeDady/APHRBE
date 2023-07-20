package co.psyke.aphr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import co.psyke.aphr.entitites.Employee;
import co.psyke.aphr.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
@CrossOrigin(originPatterns = "*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 


	@PostMapping(value="")
	public ResponseEntity<Void> postMethodName(@RequestBody Employee entity) {
		
		employeeService.addEmployee(entity);
		
		return ResponseEntity.ok(null);
	}
	
}
