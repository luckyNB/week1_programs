package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for validating the string that length must be
*            greater than or equal to 3
*/
public class UserNameValidation extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UserNameValidation(String msg) {
		super(msg);
	}

	public static void main(String[] args) {

		try {

			String name = Utility.inputString();
			String string="Hello <<username>> ! How are You?";
			
			
			
			if (name.length() < 3) {

				throw new UserNameValidation("Invalid String from Exception class");
			} else {
				System.out.println(string.replaceAll("<<username>>", name));
			}
		} catch (UserNameValidation une) {
			System.out.println("Invalid UserName:: UserNameValidation class Exception");
		}

		catch (Exception e) {
			System.out.println("Invalid UserName from catch block");
		}

	}

}
