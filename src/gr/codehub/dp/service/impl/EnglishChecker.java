package gr.codehub.dp.service.impl;

import java.util.List;
import gr.codehub.dp.service.DataChecker;

public class EnglishChecker implements DataChecker
{
	private boolean isEnglish(List<String> lines)
	{
		String firstLine = lines.get(0);
		String firstLineLower = firstLine.toLowerCase();
		return firstLineLower.contains("e") || firstLineLower.contains("t") || firstLineLower.contains("a")
				|| firstLineLower.contains("o");
	}

	@Override
	public boolean checkData(List<String> lines)
	{
		return isEnglish(lines);
	}

}
