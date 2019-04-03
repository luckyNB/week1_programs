package com.bridgelabz.factorydesignpattern;

public class FactoryPatternDemo  {
public static void main(String[] args) {
	ShapeFactory factory=new ShapeFactory();
	Shape shape1=factory.getShape("Rectangle");
	shape1.draw();

}
}
