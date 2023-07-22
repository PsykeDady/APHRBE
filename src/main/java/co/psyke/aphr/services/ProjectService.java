package co.psyke.aphr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.aphr.entitites.Project;
import co.psyke.aphr.repositories.ProjectRepository;
import java.util.List; 

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository; 

	public void addProject(Project p){
		projectRepository.save(p);
	}

	public void deleteProject(Long id){
		projectRepository.deleteById(id);
	}

	public Project getProjectById(Long id){
		return projectRepository.findById(id).orElse(null);
	}

	public void editProject(Project p){
		if(projectRepository.findById(p.getId()).isEmpty()){
			throw new IllegalArgumentException("Project not found");
		}
		addProject(p);
	}

	public List<Project> listProjects() {
		return projectRepository.findAll();
	}
}
