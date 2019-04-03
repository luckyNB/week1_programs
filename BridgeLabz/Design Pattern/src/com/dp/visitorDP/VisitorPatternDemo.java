package com.dp.visitorDP;

public class VisitorPatternDemo {
public static void main(String[] args) {
	ComputerParts computerParts=new Computer();
	computerParts.accept(new ComputerPartDisplayVisitor());
}
}
