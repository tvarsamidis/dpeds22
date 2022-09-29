package gr.codehub.dp.service.impl;

import java.util.List;
import gr.codehub.dp.service.DataSender;

public class ScreenWriter implements DataSender
{

	@Override
	public void sendData(List<String> lines, String target) throws Exception
	{
		lines.forEach(System.out::println);
	}

}
