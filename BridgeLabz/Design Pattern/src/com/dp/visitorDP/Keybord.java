package com.dp.visitorDP;

public class Keybord implements ComputerParts {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

}
