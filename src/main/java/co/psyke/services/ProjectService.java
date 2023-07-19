package co.psyke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.entitites.Project;
import co.psyke.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository; 

	public void addProject(Project p){
		projectRepository.save(p);
	}

	public void deleteProject(Project p){
		projectRepository.delete(p);
	}

	public Project getProjectById(Long id){
		return projectRepository.findById(id).orElse(null);
	}

	public void editProject(Project p){
		if(getProjectById(p.getId())!=null){
			throw new IllegalStateException("Project not found");
		}
		addProject(p);
	}
}
