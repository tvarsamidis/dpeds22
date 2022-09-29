package gr.codehub.dp.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import gr.codehub.dp.service.DataReader;

public class FileReader implements DataReader
{
	public List<String> readFile(String pathname) throws FileNotFoundException, IOException
	{
		BufferedReader reader = new BufferedReader(new java.io.FileReader(new File(pathname)));
		List<String> lines = new ArrayList<>();
		String line;
		while ((line = reader.readLine()) != null)
		{
			lines.add(line);
		}
		reader.close();
		return lines;
	}

	@Override
	public List<String> readData(String source) throws Exception
	{
		return readFile(source);
	}
}
