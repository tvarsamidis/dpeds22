package gr.codehub.dp.builder;

import gr.codehub.dp.service.DataChecker;
import gr.codehub.dp.service.DataConverter;
import gr.codehub.dp.service.DataReader;
import gr.codehub.dp.service.DataSender;

public class ServicePackage {
    private DataChecker dataChecker;
    private DataConverter dataConverter;
    private DataReader dataReader;
    private DataSender dataSender;

    public ServicePackage(ServicePackageBuilder spb) {
	dataChecker = spb.getDataChecker();
	dataConverter = spb.getDataConverter();
	dataReader = spb.getDataReader();
	dataSender = spb.getDataSender();
    }

    public DataChecker getDataChecker() {
	return dataChecker;
    }

    public DataConverter getDataConverter() {
	return dataConverter;
    }

    public DataReader getDataReader() {
	return dataReader;
    }

    public DataSender getDataSender() {
	return dataSender;
    }

}
