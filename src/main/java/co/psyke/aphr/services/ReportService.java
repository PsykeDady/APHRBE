package co.psyke.aphr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.aphr.entitites.Employee;
import co.psyke.aphr.entitites.Project;
import co.psyke.aphr.entitites.Report;
import co.psyke.aphr.models.ReportModel;
import co.psyke.aphr.repositories.ReportRepository;


@Service
public class ReportService {
	
	@Autowired
	private ReportRepository reportRepository; 

	@Autowired
	private EmployeeService employeeService; 

	@Autowired 
	private ProjectService projectService; 

	public Report reportModel2Report (ReportModel rm, boolean complete) {
		Employee e = new Employee();
		Project p = new Project();

		if(complete){
			employeeService.getEmployeeById(rm.employee()); 
			projectService.getProjectById(rm.project());
		} else {
			e.setId(rm.employee()); 
			p.setId(rm.project());
		}
		Report r = new Report(null, e, p, rm.date(), rm.hours()); 

		return r; 
	}

	public void addReport(ReportModel rm) {
		Report r=reportModel2Report(rm, false); 

		reportRepository.save(r);
	}

	public void deleteReportById(Long id){
		reportRepository.deleteById(id);
	}

	public void editReport(Report r){
		if(reportRepository.findById(r.getId()).isEmpty()){
			throw new IllegalArgumentException("Report not found");
		}
		reportRepository.save(r);
	}

	public List<Report> listReports() {
		return reportRepository.findAll(); 
	}

	public List<Report> groupByProject(){
		return reportRepository.groupByProject();
	}

	public List<Report> groupByProjectEmployeeReports(){
		return List.of();
	}

	public List<Report> groupByEmployeeReports (){
		return List.of();
	}


}
