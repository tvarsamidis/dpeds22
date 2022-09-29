package gr.codehub.dp.service;

import java.util.List;

public interface DataReader {
    List<String> readData(String source) throws Exception;
}
