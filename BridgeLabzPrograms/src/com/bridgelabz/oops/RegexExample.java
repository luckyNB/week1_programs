package com.bridgelabz.oops;

/***************************************************************************
 * @author : Laxman Bhosale.

 * @purpose: Program for reading the message and validating userName,Full Name, 
 *           Mobile Number and Date.   
 ***************************************************************************/

import com.bridgelabz.util.Utility;

public class RegexExample {

	public static void main(String[] args) {
		String name = null, fullName = null, date = null;
		String msg = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-XXXXXXXXXX.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX.";
		System.out.println("Enter user name:");
		name = Utility.inputString();
		System.out.println("Enter full name:");
		fullName = Utility.inputString();
		System.out.println("Enter Mobile:");
		String mobileNo = Utility.inputString();
		System.out.println("Enter the Date:");
		date = Utility.inputString();
		// Date date2=new Date(date);

		System.out.println("String Before replacement::");
		System.out.println(msg);
		System.out.println("************************************************************");

		if (Utility.validateName(name)) {
			msg = msg.replaceAll("<<name>>", name);
		}
		if (Utility.validateFullName(fullName)) {
			msg = msg.replaceAll("<<full name>>", fullName);
		}
		if (Utility.validatemobileNumber(mobileNo)) {
			msg = msg.replaceAll("XXXXXXXXXX", mobileNo);
		}
		if (Utility.validateDate(date)) {
			msg = msg.replaceAll("XX/XX/XXXX", date);
		}

		System.out.println("*************************************************");
		System.out.println("String after replacement");
		System.out.println(msg);
	}

}