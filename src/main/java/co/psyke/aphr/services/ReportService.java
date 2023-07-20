package co.psyke.aphr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.aphr.entitites.Report;
import co.psyke.aphr.repositories.ReportRepository;


@Service
public class ReportService {
	
	@Autowired
	private ReportRepository reportRepository; 

	public void addReport(Report r) {
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

	public List<Report> getReports() {
		return reportRepository.findAll(); 
	}

	public List<Report> groupByProject(){

	}

	public List<Report> groupByProjectEmployeeReports(){

	}

	public List<Report> groupByEmployeeReport (){
		
	}



}
