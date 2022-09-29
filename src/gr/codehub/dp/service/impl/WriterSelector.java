package gr.codehub.dp.service.impl;

import gr.codehub.dp.service.DataSender;

public class WriterSelector
{
	private static DataSender writer = null;

	public static DataSender getWriter() {
		if (writer == null) {
			selectWriter();
		}
		return writer;
	}

	private static void selectWriter()
	{
		if (Math.random() >= 0.5)
			writer = new ScreenWriter();
		else
			writer = new FileWriter();
	}
}
