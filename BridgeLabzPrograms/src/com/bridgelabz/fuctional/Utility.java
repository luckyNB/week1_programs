package com.bridgelabz.fuctional;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static int count = 0;
	public static Scanner scanner = new Scanner(System.in);
	

	/********************* static function for generating random coupons */

	public static String checkCoupons(int[] arr, int num, String str) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				str = str + Integer.toString(num);
			}
		}
		return str;
	}

	/*****************
	 * static method for getting distinct coupons
	 *******************/
	public static int getCoupon(int num) {

		boolean[] isCoupon = new boolean[num];
		int count = 0;
		int distinct = 0;

		while (distinct > 0) {
			int value = Utility.getRandomValue(num);
			count++;
			if (!isCoupon[value]) {
				distinct++;
				isCoupon[value] = true;
			}
		}
		return count;
	}

	public static int getRandomValue(int num) {
		return (int) (Math.random() * num);
	}

	/**************
	 * static method for getting double value from user
	 *******************/
	public static double inputDouble() {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value");
		return (scanner.nextDouble());

	}

	/*********************
	 * Static method for taking iput as String Array
	 *********************/

	public static String[] inputArrayOfString(String[] str, int no) {
		for (int i = 0; i < no; i++) {
			str[i] = Utility.inputString();
		}
		return str;
	}

	/********************
	 * Static method for swapping two characters
	 *******************/
	public static String swap(String arr, int low, int j) {
		char temp;
		char[] charArray = arr.toCharArray();
		temp = charArray[low];
		charArray[low] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*****************
	 * static method for creating permutations of given String
	 *********************/
	public static void permute(String str, int low, int high) {
		if (low == high)
			System.out.println(str);
		else {
			for (int i = low; i <= high; i++) {
				count++;
				str = swap(str, low, i);
				permute(str, low + 1, high);
			
			}
		}

	}

	/********************
	 * Static method calculating roots of Quadratic Equation
	 ***********************/
	public static void calculateRoot(double x, double y, double z) {
		double delta = (y * y) - (4 * x * z);

		if (delta > 0) {
			double root1 = ((-y + (Math.sqrt(delta))) / (2 * x));
			double root2 = ((-y - (Math.sqrt(delta))) / (2 * x));

			System.out.println("Root 1::" + root1);
			System.out.println("Root 2::" + root2);

		} else {
			System.out.println("Roots are Imaginary");
		}

		System.out.println("Delta:" + delta);
	}

	/*********************
	 * Static method for calculating distance using euclidian distance
	 ******************/
	public static void calculateDistace(double x, double y) {
		double sum = 0;
		sum = ((x * x) + (y * y));
		System.out.println("Distance Between x and Y :" + Math.sqrt(sum));

	}

	/******************
	 * Static method for taking input for Two Dimensional Array
	 *******************/
	public static int[][] input2DArray(int[][] arr) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter number:" + i + (j) + ":");
				arr[i][j] = scanner.nextInt();
			}
		}

		scanner.close();
		return arr;
	}

	/********************
	 * Static Method for calculating Prime Factors
	 *************************/

	public static void calculatePrimeFactors(int number) {

		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");

				number = number / i;
			}

		}

		if (number > 2) {

			System.out.println(number);

		} else {

		}
	}

	/******************
	 * static method for taking input as String
	 **************************/
	public static String inputString() {

		System.out.println("Enter the name");

		return (scanner.nextLine());
		// sc.close();

	}

	/************
	 * Static method for displaying two dimensional Array
	 ***********************/
	public static void disp2DArray(int[][] arr) {

		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				writer.print(arr[i][j] + "  ");
				// System.out.println("Enter a element:"+i+(j)+":");
			}
			writer.println();
		}
		writer.close();
	}

	/************
	 * static method for Validating input String that String must be minimum 3 chars
	 **************/
	public static void validate(String name) {
		if (name.length() < 4) {
			System.out.println("Invalid Name");
		} else {
			System.out.println("Hello," + name + ",How are you?");
		}
	}

	/* static method for taking input as Integer */
	public static int inputNumber() {
		return (scanner.nextInt());

	}

	/**************** Program for calculating 2's power table ********************/

	public static int inputNumberPower() {

		System.out.println("Enter a number to get power table of 2::");
		return (scanner.nextInt());

	}

	/***************
	 * static method for generating harmonic number
	 ******************/
	public static void generateHarmonic(double no) {
		double sum = 0;
		for (double i = 1; i <= no; i++) {
			sum = sum + (1 / i);
		}
		System.out.println("Harmonic Number :::" + sum);

	}

	/*
	 * static method for creating power table of 2 2^i where i=0,1,2,3,4,5,..,n as
	 * per input
	 */
	public static void createTable(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("2^" + i + "::" + Math.pow(2, i));
		}
	}

	/*************
	 * Method for getting head or tail percentage
	 *****************************/
	public static void headOrTail(int n) {

		double head = 0;
		double tail = 0;
		double data;
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			data = random.nextDouble();
			if (data > 0.5) {
				tail++;

			} else {
				head++;
			}

		}

		System.out.println("Head %:" + (head / n) * 100);
		System.out.println("Tail %:" + (tail / n) * 100);

	}

	public static int generate(int n) {
		Random random = new Random();
		int x = random.nextInt(n);

		return x;

	}

	/********************
	 * Method for Converting decimal value to binary value
	 *************************/

	public static String decimalToBinary(int num) {
		int rem;
		String str = "";
		while (num > 0)

		{

			rem = num % 2;

			if (rem == 1)

			{

				count++;

			}

			str = str + "" + rem;

			num = num / 2;

		}

		@SuppressWarnings("deprecation")
		Long i1 = new Long(str);
		System.out.println(i1);
		return str;
	}

	public static int inputInteger() {

		return (scanner.nextInt());

	}

	/*************** function to convert decimal to binary *********************/
	public static int[] decToBinary(int num) {
		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (num > 0) {
			// storing remainder in binary array
			binaryNum[i] = num % 2;
			num = num / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
		return binaryNum;
	}

	/****************
	 * Static method for checking given year is leap Year or not
	 ****************/
	public static boolean checkYear(int year) {
		// boolean b=false;
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			}
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
		return false;
	}

	
	/**************** Method for year as input from user ************/
	public static int getYear() {

		System.out.println("Enter any Year to Check");
		int year = scanner.nextInt();
		if (year < 9999 && year > 999) {
			return year;
		} else {
			System.out.println("Please Enter year That is 4 Digit");
			return (Integer) null;
		}

	}

	/*************
	 * Method for guessing a number using Binary search Logic
	 **************/
	public static void guess(int[] arr) {
		int low, high, mid;
		low = 0;
		high = 100;
		mid = (low + high) / 2;
		int b;
		Scanner scanner = new Scanner(System.in);

		while (low < high) {
			System.out.println(arr[mid]);
			b = scanner.nextInt();

			if (b == 0) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
			mid = (low + high) / 2;

		}

		scanner.close();
	}

}
