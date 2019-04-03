package com.dp.factoryDP;

public class OperatingSystemFactory {
	public OS getInstance(String string) {
		if(string.equals("Open"))
		{
			return new Android();
		}
		else if (string.equals("Close")) {
			return new IOS();
		}
		else {
			return new Windows();	
		}
	}

}
