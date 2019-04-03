package com.exceptionHandling;
import java.util.*;

public class RollNoValidation extends Exception{
	String rollNo=null;
	
	
	public RollNoValidation(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
public void getRollNo() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter RollNo");
	 rollNo=scanner.nextLine();
}
	public boolean validate() {
		if(rollNo.length()!=10) {
			try {
				throw new RollNoValidation("Invalid RollNo! Please Check Once!");
			} catch (RollNoValidation e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		return false;
		
	}
	
	public void displayRollNo() {
	
			System.out.println("Roll Number is Valid");
			System.out.println("Roll Number::"+rollNo);
		
	}
	
}

