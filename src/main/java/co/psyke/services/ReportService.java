package co.psyke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.psyke.repositories.ReportRepository;

@Service
public class ReportService {
	
	@Autowired
	private ReportRepository reportRepository; 

	

}
