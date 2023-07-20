package co.psyke.aphr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.psyke.aphr.entitites.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{}
