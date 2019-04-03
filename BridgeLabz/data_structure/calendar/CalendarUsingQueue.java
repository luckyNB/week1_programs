package com.bridgelabz.data_structure.calendar;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class CalendarUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		sc.close();
		Utility.calenderQueue(month,year);
		
	}

}
