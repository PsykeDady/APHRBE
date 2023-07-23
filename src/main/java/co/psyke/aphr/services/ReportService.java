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
		Report r = new Report(rm.id(), e, p, rm.date(), rm.hours()); 

		return r; 
	}

	public void addReport(ReportModel rm) {
		Report r=reportModel2Report(rm, false); 

		reportRepository.save(r);
	}

	public void deleteReportById(Long id){
		reportRepository.deleteById(id);
	}

	public void editReport(ReportModel rm){
		if(reportRepository.findById(rm.id()).isEmpty()){
			throw new IllegalArgumentException("Report not found");
		}

		Report r = reportModel2Report(rm,false);
		reportRepository.save(r);
	}

	public List<Report> listReports() {
		return reportRepository.findAll(); 
	}

	public Report getReport(Long id) {
		return reportRepository.findById(id).orElse(null); 
	}

	public List<Report> groupByProject(){
		List<Object[]> results= reportRepository.groupByProject();
		
		List <Report> reports = new java.util.LinkedList<>(); 

		for (Object[] row : results) {
			Report r= new Report(); 
			
			Project p = (Project) row[0]; 
			r.setProject(p);

			Double hours = Double.parseDouble(row[1].toString());
			r.setHours(hours);

			reports.add(r);
		}

		return reports;
	}

	public List<Report> groupByProjectEmployeeReports(){
		List<Object[]> results= reportRepository.groupByProjectEmployeeReports();
		
		List <Report> reports = new java.util.LinkedList<>(); 

		for (Object[] row : results) {
			Report r= new Report(); 
			
			Project p = (Project) row[0]; 
			r.setProject(p);

			Employee e = (Employee) row[1]; 
			r.setEmployee(e);

			Double hours = Double.parseDouble(row[2].toString());
			r.setHours(hours);

			reports.add(r);
		}

		return reports;
	}

	public List<Report> groupByEmployeeProjectReports (){
		List<Object[]> results= reportRepository.groupByEmployeeProjectReports();
		
		List <Report> reports = new java.util.LinkedList<>(); 

		for (Object[] row : results) {
			Report r= new Report(); 
			
			Employee e = (Employee) row[0]; 
			r.setEmployee(e);
			
			Project p = (Project) row[1]; 
			r.setProject(p);

			Double hours = Double.parseDouble(row[2].toString());
			r.setHours(hours);

			reports.add(r);
		}

		return reports;
	}


}
