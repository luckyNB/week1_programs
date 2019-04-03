package com.bridgelabz.algorithm;

/*@author Laxman Bhosale

 *purpose:Reusable static methods for functional programs 
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	/*************
	 * static method for bubble sort for reading data from file
	 *************/
	public static String[] bubbleStringSortForReadingWord(String[] str, int num) {
		String temp = "";
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				if (Math.abs(str[j].hashCode()) > Math.abs(str[j + 1].hashCode())) {

					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;

				}
			}

		}
		return str;

	}

	/******************************
	 * static method for input array from user
	 *********************************/
	public static int[] inputArray(int[] arr, int no) {
		for (int i = 0; i < no; i++) {
			arr[i] = Utility.inputNumber();
		}

		return arr;
	}

	/************* Function to sort array using insertion sort *************/
	public static double insertionSortForElapsedTime(int arr[]) {
		double start = System.currentTimeMillis();

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		double stop = System.currentTimeMillis();
		return (stop - start);
	}

	/*
	 * static method for sorting using bubble sort
	 */
	public static double bubbleSortForElapsedTime(int[] arr) {
		double start = System.currentTimeMillis();
		int temp = 0;
		int no = arr.length;
		for (int i = 0; i < no - 1; i++) {
			for (int j = 0; j < no - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		double stop = System.currentTimeMillis();
		return (stop - start);
	}

	/*
	 **************** method for binary search for getting Elapsed time to search an element from
	 * ************** Array
	 */
	public static double binarySearchForElapsedTime(int[] arr, int no, int search) {
		// double start=(double) System.currentTimeMillis();
		double start = System.currentTimeMillis();
		int low = 0, high = no, mid = 0;
		mid = (low + high / 2);
		Arrays.sort(arr);
		System.out.println("Sorted Array :");
		for (int i = 0; i < no; i++) {
			System.out.println(arr[i]);
		}
		while (low < high) {
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				low = mid + 1;
			} else if (arr[mid] > search) {
				high = mid - 1;
			}

			mid = ((low + high) / 2);
		}
		double stop = System.currentTimeMillis();

		return (stop - start);

	}

	/*************** static method for binary search for String *****************/
	public static int binarySearch(String[] arr, String search) {
		int lower = 0, high = arr.length - 1;
		while (lower <= high) {
			int mid = lower + (high - lower) / 2;

			int response = search.compareTo(arr[mid]);

			// Check if x is present at mid
			if (response == 0)
				return mid;

			// If x greater, ignore left half
			if (response > 0)
				lower = high + 1;

			// If x is smaller, ignore right half
			else
				high = mid - 1;
		}

		return -1;
	}

	/********************
	 * static method for insertion sort of String Array
	 ****************/
	public static String[] insertionStringSort(String[] str, int num) {
		/***************
		 * 8 Function to sort array using insertion sort ********************8
		 */
		String skey = "";
		num = str.length;
		for (int i = 1; i < num; ++i) {
			skey = str[i];
			int key = Math.abs(str[i].hashCode());
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && str[j].hashCode() > key) {
				str[j + 1] = str[j];
				j = j - 1;
			}
			str[j + 1] = skey;
		}
		return str;
	}
	/*static function for Sorting generic data type elements*/
	
	public static Object[] insertionSortForGenerics(Object[] data,int num) {
		Object datakey;
		for(int i=1;i<num;i++) {
			datakey=data[i];
			int key=Math.abs(data[i].hashCode());
			int j=i-1;
			
			
			
			while(j>=0&&data[j].hashCode()>key) {
				data[j+1]=data[j];
				j=j-1;
				
			}
			data[j+1]=datakey;
			
		}
		return data;
	}
	

	/*****************
	 * static method for displaying String Array
	 *******************/
	public static void printStringAray(String[] str, int no) {
		for (int i = 0; i < no; i++) {
			System.out.println(str[i]);
		}
	}

	/*********************************************
	 * static method for bubble sort for String
	 **************************************************/
	public static String[] bubbleStringSort(String[] str, int num) {
		String temp = "";
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				if (Math.abs(str[j].hashCode()) > Math.abs(str[j + 1].hashCode())) {

					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;

				}
			}

		}
		return str;

	}

	/*******************
	 * static method for taking input from user as String Array
	 ********************/
	public static String[] inputStringArray(int num) {
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = Utility.inputString();
		}
		return str;

	}

	/*****************
	 * Merges two subarrays of arr[]. First subarray is arr[l..m] Second subarray is
	 * arr[m+1..r]
	 *************************************/
	public static void merge(int arr[], int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temp arrays */
		int lowerArray[] = new int[n1];
		int upperArray[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			lowerArray[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			upperArray[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (lowerArray[i] <= upperArray[j]) {
				arr[k] = lowerArray[i];
				i++;
			} else {
				arr[k] = upperArray[j];
				j++;
			}
			k++;
		}

		/************* Copy remaining elements of lowerrArray[] if any ************/
		while (i < n1) {
			arr[k] = lowerArray[i];
			i++;
			k++;
		}

		/*************** Copy remaining elements of upperArray[] if any ************/
		while (j < n2) {
			arr[k] = upperArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			// Find the middle point
			int mid = (low + high) / 2;

			// Sort first and second halves
			sort(arr, low, mid);
			sort(arr, mid + 1, high);

			// Merge the sorted halves
			merge(arr, low, mid, high);
		}
	}

	/**
	 * Function to print array
	 *
	 * @param array the array to print integer on console
	 */
	public static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * Function to check if no is power of 2
	 *
	 * @param number to check the for power of 2
	 * @return boolean for prime no
	 */
	public static boolean powerOf2(int n) {
		// calculate power of 2 using math.pow
		// check if is equal to given no
		// stops if pow is greater than given number
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	/**
	 * Function to swap nibbles in array
	 *
	 * @param int array to swap nibbles in array
	 * @return return swapped array
	 */
	public static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	/**************** static method for binart search for String *****************/
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		Arrays.sort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/*******************
	 * static method for taking input as String array from user
	 ****************/
	public static String[] inputArrayOfString(String[] str, int no) {
		for (int i = 0; i < no; i++) {
			str[i] = Utility.inputString();
		}
		return str;
	}

	/**********************
	 * static function for bubbleSort
	 ***************************/
	public static String[] bubbleSortString(String input) {

		String[] str = input.split(", ");
		String tempStr = "";

		for (int t = 0; t < str.length - 1; t++) {
			for (int i = 0; i < str.length - 1; i++) {
				if (Math.abs(str[i + 1].compareTo(str[1 + 1])) > 0) {
					tempStr = str[i];
					str[i] = str[i + 1];
					str[i + 1] = tempStr;
				}
			}

		}

		return str;
	}

	/**********************
	 * static function for bubbleSort for Generics
	 ***************************/
	public static Object[] bubbleSortForGenerics(Object[] input, int length) {
		// int str=input.
		// String[] str = input.split(", ");
		Object temp;
		
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (Math.abs(input[j].hashCode()) > Math.abs(input[j + 1].hashCode())) {
					temp = input[j];
					input[j] = input[j + 1];
                      input[j+1]=temp;
				}
			}
		}
		

		return input;

	}

	/*
	 **************** static method for calculating mothly payment using formula ****************
	 */
	public static double calculatePayment(double p, double y, double r) {
		double n = 12 * y;
		double payment = 0;
		payment = ((p * r) / (1 - Math.pow((1 + r), (-n))));
		return payment;

	}
	/* static method for taking input as double value */

	public static double inputDouble() {
		System.out.println("Enter Temperature:");
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		scanner.close();
		return temp;
	}

	/*
	 ****************** static method for converting temperature Fahrenheit to Celsius using
	 * Formula*************************** ***************
	 */
	public static double farenheightToCelsius(double temp) {
		double celcius = 0;
		celcius = (temp - 32) * (5 / 9);
		return celcius;
	}

	/*
	 ***************** static method for converting temperature Celsius to Fahrenheit using Formula
	 * ********************* ***************
	 */
	public static double celsiusToFarenheight(double temp) {
		double fahrenheit = (temp * 9 / 5) + 32;
		return fahrenheit;
	}

	/**
	 ******************** static method for calculating all prime number between 1 to 1000 and storing
	 * into ArrayList ******** *******************
	 */
	public static <E> ArrayList<E> getPrimeNumber() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				ar.add(j);
			}
		}
		return (ArrayList<E>) ar;
	}

	/**************************************************************************************
	 * static method to check the day of the week of given date
	 *
	 * param d int value for day of date param m int value for month of year param y
	 * int value for year return day of week from 0 to 6 from sunday to saturday
	 *************************************************************************************/

	public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return (d0 + 1);
	}

	/************************************************
	 * Function to sort array using insertion sort
	 ************************************************/
	public static int[] insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * ***********Move elements of arr[0..i-1], that are greater than key, to one
			 * position ************* ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				showArr(arr);
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/*
	 ******************* static method for sorting using bubble sort ************************
	 */
	public static int[] bubbleSort(int[] arr) {
		int temp = 0;
		int no = arr.length;
		for (int i = 0; i < no - 1; i++) {
			for (int j = 0; j < no - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

		return arr;

	}

	/***********************************
	 * static method for printing an array
	 *************************************/
	public static void printArray(int[] arr2) {

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	/**************************************
	 * Method for getting String from user
	 ***************************************/
	public static String inputString() {
		String str1 = "";
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.nextLine();

		return str1;
	}

	/********************** method for binary search *************************/
	public static int binarySearch(int[] arr, int no, int search) {
		// double start=(double) System.currentTimeMillis();

		int low = 0, high = no, mid = 0;
		mid = ((low + high) / 2);
		Arrays.sort(arr);
		System.out.println("Sorted Array :");
		for (int i = 0; i < no; i++) {
			System.out.println(arr[i]);
		}
		while (low < high) {
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				low = mid + 1;
			} else if (arr[mid] > search) {
				high = mid - 1;
			}

			mid = ((low + high) / 2);
		}

		return -1;

	}

	/*******************************************************************************
	 * 
	 * /* Method for checking strings are anagram or not
	 **********************************************************************************/
	public static boolean areAnagram(String s1, String s2) {
		char chr1[] = new char[s1.length()];
		char chr2[] = new char[s2.length()];
		chr1 = s1.toCharArray();
		chr2 = s2.toCharArray();

		Arrays.sort(chr1);
		Arrays.sort(chr2);

		for (int i = 0; i < s1.length(); i++) {
			if (chr1[i] != chr2[i]) {
				return false;
			}
		}
		return true;
	}

	/*********** Method to convert decimal to binary ******************** */
	public static int[] decimalToBinary(int decimal) {

		String binary = "";
		while (decimal != 0) {
			binary = (decimal % 2) + binary;
			decimal = decimal / 2;
		}
		while (binary.length() < 8) {
			binary = 0 + binary;
		}
		return stringToIntArray(binary);
	}

	/**
	 * Function to convert string to int array helper function for swapnibble in
	 * Binary.java class
	 *
	 * @param bin String of binary no
	 * @return return integer array
	 */
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	/**
	 * Function to convert binary to decimal
	 *
	 * @param binary the binary array to cenvert
	 * @return return converted decimal no
	 */
	public static int binaryToDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}

	/********* Method for checking anagram or not ********************/
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	/*************
	 * static method for incrementing array index count for checking an anagram
	 * numbr
	 ***************/
	public static int[] count(int num) {
		int[] count = new int[10];
		int temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			count[rem]++;
			temp = temp / 10;
		}
		return count;
	}

	/************** Method to check if no is anagram or not ***********************/

	public static void primeAnagrams() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println();
		boolean flag;
		for (int j = 2; j <= 1000; j++) {
			flag = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				arrayList.add(j);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (anagram(arrayList.get(i), arrayList.get(j))) {
					System.out.println(arrayList.get(i) + "  " + arrayList.get(j));
				}
			}
		}
	}

	/***************
	 * Method to get input from user as integer
	 *************************/
	public static int inputNumber() {
		int num;
		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();
		return num;
	}

	/**
	 *************** Method for getting probablility of getting head or tails using Random class
	 * 
	 */

	public static void headOrTail(int num) {
		double head = 0;
		double tail = 0;
		double data;
		Random r = new Random();

		while (num > 0) {
			data = r.nextDouble();
			if (data > 0.5) {
				tail++;

			} else {
				head++;
			}
		}

		System.out.println("Head %:" + (head / num) * 100);
		System.out.println("Tail %:" + (tail / num) * 100);

	}

	/****
	 * Method for generating random number between given from 0 to given number n
	 ****************/
	public static int generate(int num) {
		Random random = new Random();
		int value = random.nextInt(num);

		return value;

	}

	/**
	 * Method for guessing a number using binary search logic checking each time no
	 * is greater or less than the printed number on the screen or may be guessed
	 * number
	 */
	public static void guess(int num) {
		System.out.println("Think any secret number (0 to 2^"+num+")::");
		int first = 0;
		int last =(int) Math.pow(2, num);

		while (first < last) {
			int mid = (first + last) / 2;
			System.out.println(mid);
			System.out.println("Enter 0 if number is less than printed number");
			System.out.println("Enter 1 if number is greater than printed number");
			int guess = Utility.inputNumber();
			if (guess == 0) {
				last = mid - 1;
			} else if (guess == 1) {
				first = mid + 1;
			} else {
				System.out.println("Invalid Input");
			}

		}
	}

}
