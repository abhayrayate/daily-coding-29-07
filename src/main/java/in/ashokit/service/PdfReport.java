package in.ashokit.service;

import org.springframework.stereotype.Component;

@Component
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("Pdf Report Generated......");
		
	}

}
