package com.bridgelabz.fuctional;

//import fuctionalPrograms.Utility;
/*
* @author :  Laxman Bhosale 
* @purpose:  Program for validating the string that length must be
*            greater than or equal to 3
* @Date   : 13/02/2019          
*/
public class HelloUser {

	public static void main(String[] args) {
		String name = "";
		name = Utility.inputString();
		Utility.validate(name);

	}

}
