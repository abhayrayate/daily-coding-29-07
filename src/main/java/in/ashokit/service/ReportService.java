package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.reports.IReport;

@Service
public class ReportService {

	@Autowired   //field injection krtoy 
	@Qualifier("excel")
	private IReport report;
	
	public void generate()
 	{
		report.generateReport();
	}
}
