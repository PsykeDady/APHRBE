package co.psyke.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.entitites.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{}
