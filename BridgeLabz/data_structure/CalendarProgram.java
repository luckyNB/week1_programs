package com.bridgelabz.data_structure;

/**@author : Laxman Bhosale
 *@purpose: Program for creating calendar using 2D Array.
 *@Date   : 04/03/2019
 *
 * */

public class CalendarProgram {

	public static int[][] calender = new int[6][7];// 2D Array for storing and displaying the calendar
	public static int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// total month with days in a year
	/* Intializing calendar with value */

	public static void initCal() {
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = -7;
			}
		}
	}

	/* Static method for displaying the calendar after performing operations */
	public static void display(int m) {
		System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {

				if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) {

					System.out.print("\t ");
				} else if (calender[i][j] > 0) {
					System.out.print("\t" + calender[i][j] + " ");
				}
			}
			System.out.println("\t");

		}
	}

	public static void putCalender(int d) {
		int d1 = 1;
		for (int i = d; i < calender[0].length; i++) {
			// System.out.print(d1);
			calender[0][i] = d1++;
			System.out.println(calender[0][i]);
		}
		for (int i = 1; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = d1++;
			}
		}

	}

	public static void dispCalender(int m, int y) {
		int d = dayOfWeek(m, y);
		initCal();
		putCalender(d);
		if (com.bridgelabz.fuctional.Utility.checkYear(y)) {
			month[2] = 29;
		}
		display(m);

	}

	/* static method for finding the day of week from where month starts */
	public static int dayOfWeek(int m, int y) {

		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	public static void main(String[] args) {
 
		System.out.println("enter month");
		int m = Utility.inputInteger();
		System.out.println("enter year");
		int y = Utility.inputInteger();
		dispCalender(m, y);
	}
}