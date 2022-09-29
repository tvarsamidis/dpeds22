package gr.codehub.dp.service;

import java.util.List;

public interface DataSender {
    public void sendData(List<String> lines, String target) throws Exception;
}
