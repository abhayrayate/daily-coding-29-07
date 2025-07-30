package in.ashokit.reports;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("Pdf Report Generated......");
		
	}

}
