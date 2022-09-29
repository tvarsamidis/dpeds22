package gr.codehub.dp.builder;

import gr.codehub.dp.service.DataChecker;
import gr.codehub.dp.service.DataConverter;
import gr.codehub.dp.service.DataReader;
import gr.codehub.dp.service.DataSender;

public class ServicePackageBuilder {
    private DataChecker dataChecker;
    private DataConverter dataConverter;
    private DataReader dataReader;
    private DataSender dataSender;

    public ServicePackageBuilder() {
    }

    public ServicePackageBuilder dataChecker(DataChecker dataChecker) {
	this.dataChecker = dataChecker;
	return this;
    }

    public ServicePackageBuilder dataConverter(DataConverter dataConverter) {
	this.dataConverter = dataConverter;
	return this;
    }

    public ServicePackageBuilder dataReader(DataReader dataReader) {
	this.dataReader = dataReader;
	return this;
    }

    public ServicePackageBuilder dataSender(DataSender dataSender) {
	this.dataSender = dataSender;
	return this;
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

    public ServicePackage build() {
	return new ServicePackage(this);
    }

}
