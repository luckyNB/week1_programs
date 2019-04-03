package com.bridgelabz.oops.clinicManagementSystem;


import java.util.Date;

import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class ClinicManagement {
	static Date date;
	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			System.out.println("Clinic Management System");
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. Close");
			choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				new DoctorPatientImplementation().operation(); // to add doctor or patients details or to fix appointment
				break;
			case 2:
				new SearchingImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}
