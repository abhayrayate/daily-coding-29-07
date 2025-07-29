package in.ashokit.service;

import org.springframework.stereotype.Component;

@Component
public class ExcelReport implements IReport{

	@Override
	public void generateReport()
	{
		System.out.println("Excel Report Generated.........");
	}

}
