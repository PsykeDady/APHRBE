package co.psyke.aphr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.psyke.aphr.entitites.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{

	@Query("""
			SELECT r.project_id, COUNT(hours) as hours 
			FROM Report r
			GROUP BY r.project_id
			""")
	List<Report> groupByProject (); 

}
