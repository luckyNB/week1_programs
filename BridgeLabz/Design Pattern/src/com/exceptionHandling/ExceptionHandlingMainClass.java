package com.exceptionHandling;

public class ExceptionHandlingMainClass {
public static void main(String[] args) {
	RollNoValidation rollNoValidation=new RollNoValidation("Invalid Roll Number");
	rollNoValidation.getRollNo();
	rollNoValidation.validate();
	rollNoValidation.displayRollNo();
	
}
}
