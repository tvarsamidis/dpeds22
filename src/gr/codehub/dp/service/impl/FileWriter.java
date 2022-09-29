package gr.codehub.dp.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import gr.codehub.dp.service.DataSender;

public class FileWriter implements DataSender
{
	private void writeFile(List<String> lines, String pathname) throws IOException
	{
		PrintWriter writer = new PrintWriter(new java.io.FileWriter(new File(pathname)));
		for (String s : lines)
			writer.write(s + "\n");
		writer.close();
	}

	@Override
	public void sendData(List<String> lines, String target) throws Exception
	{
		writeFile(lines, target);
	}
}
