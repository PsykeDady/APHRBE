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

import co.psyke.aphr.entitites.Project;
import co.psyke.aphr.services.ProjectService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull; 

@RestController
@RequestMapping("/project")
@CrossOrigin(originPatterns = "*")
public class ProjectController {
	@Autowired
	private ProjectService projectService; 


	@PostMapping(value="")
	public ResponseEntity<Void> postMethodName(@RequestBody @Valid Project project) {
		
		projectService.addProject(project);
		
		return ResponseEntity.ok(null);
	}

	@DeleteMapping(value = "")
	public ResponseEntity<Void> deleteProject(@RequestBody @NotNull Long id){
		projectService.deleteProject(null);

		return ResponseEntity.ok(null); 
	}

	@PutMapping(value = "")
	public ResponseEntity<Void> editProject(@RequestBody @Valid Project p){
		projectService.editProject(p);

		return ResponseEntity.ok(null); 
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Project> getProject (@PathVariable @NotNull Long id){
		Project p = projectService.getProjectById(id);

		return ResponseEntity.ok().body(p);
	}

	@GetMapping(value = "")
	public ResponseEntity<List<Project>> listProjects() {
		List<Project> projects = projectService.listProjects(); 

		return ResponseEntity.ok().body(projects);
	}
	
}
