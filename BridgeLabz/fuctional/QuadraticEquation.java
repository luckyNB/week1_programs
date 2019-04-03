package com.bridgelabz.fuctional;


/*
* @author :  Laxman Bhosale 
* @purpose:  Program for  getting root of quadratic equations using formula.
* @Date   :  18/02/2019          
*/
public class QuadraticEquation {

	public static void main(String[] args) {

		double a1, b, c;
		System.out.println("*******Quadratic Equation******");
		System.out.println("Enter the value a ,b,c respectively");

		a1 = Utility.inputNumber();
		b = Utility.inputNumber();
		c = Utility.inputNumber();
		Utility.calculateRoot(a1, b, c);

	}

}
