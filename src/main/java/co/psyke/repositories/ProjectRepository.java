package co.psyke.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.entitites.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {}
