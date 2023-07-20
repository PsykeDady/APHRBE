package co.psyke.aphr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.aphr.entitites.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {
	
}
