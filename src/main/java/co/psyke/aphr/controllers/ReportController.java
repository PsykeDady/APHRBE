package co.psyke.aphr.controllers;

import java.util.List;

import org.hibernate.dialect.PostgreSQL81Dialect;
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

import co.psyke.aphr.entitites.Report;
import co.psyke.aphr.models.ReportModel;
import co.psyke.aphr.services.ReportService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull; 

@RestController
@RequestMapping("/report")
@CrossOrigin(originPatterns = "*")
public class ReportController {
	
	@Autowired
	private ReportService reportService; 

	@PostMapping(value="")
	public ResponseEntity<Void> addReport(@RequestBody @Valid ReportModel reportModel) {
		
		reportService.addReport(reportModel);
		
		return ResponseEntity.ok(null);
	}
	

	@DeleteMapping(value = "")
	public ResponseEntity<Void> deleteReport(@RequestBody @NotNull Long id){
		reportService.deleteReportById(id);

		return ResponseEntity.ok(null);
	}

	@PutMapping(value="")
	public ResponseEntity<Void> editReport(@RequestBody @Valid Report r) {
		reportService.editReport(r);

		return ResponseEntity.ok(null); 
	}
	
	@GetMapping(value = "")
	public ResponseEntity<List<Report>> listReports () {
		List<Report> reports=reportService.listReports(); 


		return ResponseEntity.ok().body(reports); 
	}	

	@GetMapping(value = "projects")
	public ResponseEntity<List<Report>> groupByProject() {
		List <Report> reports= reportService.groupByProject(); 

		return ResponseEntity.ok().body(reports);
	}

	@GetMapping(value = "projectsemployeer")
	public ResponseEntity<List<Report>> groupByProjectEmployeeReports(){
		List <Report> reports= reportService.groupByProject(); 

		return ResponseEntity.ok().body(reports);		
	}

	@GetMapping(value = "employeer")
	public ResponseEntity<List<Report>> groupByEmployeeReports(){
		List <Report> reports= reportService.groupByEmployeeReports(); 

		return ResponseEntity.ok().body(reports);		
	}
}
