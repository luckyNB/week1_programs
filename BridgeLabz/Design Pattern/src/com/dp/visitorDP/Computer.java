package com.dp.visitorDP;

public  class Computer implements ComputerParts {

	ComputerParts[] parts;

public Computer() {

	parts =new ComputerParts[] { new Monitor() ,new Keybord() ,new Mouse() };
	 



}

	@Override
	public void accept(ComputerPartVisitor visitor) {

		 for (int i = 0; i < parts.length; i++) {
			parts[i].accept(visitor);
		}
		 visitor.visit(this);

	}
}
