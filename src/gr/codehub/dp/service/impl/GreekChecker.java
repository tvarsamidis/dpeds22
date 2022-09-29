package gr.codehub.dp.service.impl;

import java.util.List;
import gr.codehub.dp.service.DataChecker;

public class GreekChecker implements DataChecker
{

	@Override
	public boolean checkData(List<String> lines)
	{
		if (lines.size() == 0) return false;
		String firstLine = lines.get(0);
		String letters = "αβγδεζ";
		for(int i = 0 ; i < letters.length(); i++) {
			if (firstLine.contains("" + letters.charAt(i)))
					return true;
		}
		return false;
	}

}
