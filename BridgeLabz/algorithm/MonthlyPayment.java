package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for calculating monthly payment using formula.
* @Date   :  13/02/2019          
*/
public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter values of  P Y and R Respectively through Commandline ");

		double principle = Double.parseDouble(args[0]);
		double year = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		double payment = Utility.calculatePayment(principle, year, rate);

		System.out.println("Monthly Payment is:" + payment);

	}
}
