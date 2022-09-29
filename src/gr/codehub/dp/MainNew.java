package gr.codehub.dp;

import java.util.List;

import gr.codehub.dp.builder.ServicePackage;
import gr.codehub.dp.builder.ServicePackageBuilder;
import gr.codehub.dp.service.impl.EnglishChecker;
import gr.codehub.dp.service.impl.FileReader;
import gr.codehub.dp.service.impl.UpperCaseConverter;
import gr.codehub.dp.service.impl.WriterSelector;

public class MainNew {
    private static final String ROOT = "./data/";
    private static ServicePackage servicePackage;

    public static void main(String[] args) {
	System.out.println("Processing started");

	servicePackage = new ServicePackageBuilder()
		.dataReader(new FileReader())
		.dataConverter(new UpperCaseConverter())
		.dataSender(WriterSelector.getWriter())
		.dataChecker(new EnglishChecker())
		.build();

	doBusiness();
	System.out.println("Processing completed");
    }

    private static void doBusiness() {
	try {
	    final List<String> originalLines = readData(ROOT + "input.txt");
	    if (!checkLanguage(originalLines)) {
		terminateApplication();
	    }
	    List<String> convertedLines = convertLines(originalLines);
	    sendData(convertedLines, ROOT + "output.txt");
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private static List<String> convertLines(List<String> lines) {
	return servicePackage.getDataConverter().convertLines(lines);
    }

    private static void sendData(List<String> lines, String pathname) throws Exception {
	servicePackage.getDataSender().sendData(lines, pathname);
    }

    private static boolean checkLanguage(List<String> lines) {
	boolean checked = servicePackage.getDataChecker().checkData(lines);
	return checked;
    }

    private static List<String> readData(String pathname) throws Exception {
	return servicePackage.getDataReader().readData(pathname);
    }

    private static void terminateApplication() {
	System.out.println("No english text, no processing done");
	System.exit(1);
    }

}
