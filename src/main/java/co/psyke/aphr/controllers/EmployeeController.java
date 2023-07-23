package co.psyke.aphr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.psyke.aphr.entitites.Employee;
import co.psyke.aphr.services.EmployeeService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;



@RestController
@RequestMapping("/employee")
@CrossOrigin(originPatterns = "*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 


	@PostMapping(value="")
	public ResponseEntity<Void> addEmployee(@RequestBody @Valid Employee employee) {
		employeeService.addEmployee(employee);
		return ResponseEntity.ok(null);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteEmployee (@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok(null);
	}

	@PutMapping(value = "")
	public ResponseEntity<Void> editEmployee (@RequestBody @Valid Employee e) {
		employeeService.editEmployeeById(e);
		return ResponseEntity.ok(null);
	}

	@GetMapping(value="{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
		Employee e = employeeService.getEmployeeById(id);

		return ResponseEntity.ok().body(e);
	}

	@GetMapping(value="")
	public ResponseEntity<List<Employee>> listEmployees() {
		List<Employee> employees = employeeService.listEmployees(); 

		return ResponseEntity.ok().body(employees); 
	}
	
	
}
