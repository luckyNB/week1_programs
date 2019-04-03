package com.dp.adapterSchool;

import com.dp.factoryDP.PilotPen;

public class PenAdapter implements Pen{
PilotPen pilotPen=new PilotPen();
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
			
		pilotPen.mark(str);
	}

}
