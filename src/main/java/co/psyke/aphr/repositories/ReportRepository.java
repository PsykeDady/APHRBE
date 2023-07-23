package co.psyke.aphr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.psyke.aphr.entitites.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{

	@Query("""
			SELECT r.project, SUM(hours)
			FROM Report r
			GROUP BY r.project
			""")
	List<Object[]> groupByProject ();

	@Query("""
			SELECT r.project, r.employee, SUM(hours)
			FROM Report r
			GROUP BY r.project, r.employee
			""")
	List<Object[]> groupByProjectEmployeeReports();

	@Query("""
			SELECT r.employee, r.project, SUM(hours)
			FROM Report r
			GROUP BY r.employee, r.project
			""")
	List<Object[]> groupByEmployeeProjectReports();


}
