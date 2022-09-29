package gr.codehub.dp.service.impl;

import java.util.ArrayList;
import java.util.List;
import gr.codehub.dp.service.DataConverter;

public class UpperCaseConverter implements DataConverter
{
	public List<String> convertLines(List<String> lines)
	{
		return convertToUpperCase(lines);
	}

	private List<String> convertToUpperCase(List<String> lines)
	{
		List<String> newLines = new ArrayList<>();
		for (String s : lines)
			newLines.add(s.toUpperCase());
		return newLines;
	}
}
