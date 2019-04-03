package com.bridgelabz.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
	public static Scanner scanner = new Scanner(System.in);
//for getting input as string from user
	public static String stringInput() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		return string;

	}
//for getting integer as user input
	public static int inputInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the interger:- ");
		int integer = scanner.nextInt();
		return integer;

	}
//for getting string as printing strings
	public static void printString(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}
//for printing the two 2D array
	public static void printString2d(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
		}
	}
//for printing array of elements of type integer
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
  //for searching the element from char array using binary search..
	public static boolean serachString(String[] chararray, String key) {
		int start = 0;
		int end = chararray.length;
		printString(chararray);
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == chararray[mid]) {
				return true;
			} else if ((Math.abs(key.hashCode())) < (Math.abs(chararray[mid].hashCode()))) {
				end = mid - 1;
			} else if ((Math.abs(key.hashCode())) > (Math.abs(chararray[mid].hashCode()))) {
				start = mid + 1;
			}
		}
		return false;
	}
   //method for writing the file 
	public static LinkedList writefile(LinkedList wordlist) throws IOException, FileNotFoundException {
		File file = new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/data_structure/NumbersOrdered");
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			while (!wordlist.isEmpty()) {
				bufferedWriter.write(wordlist.get() + " ");
				bufferedWriter.flush();
//			bufferedWriter.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bufferedWriter.close();
		}

		return wordlist;

	}
//for getting integer as user input
	public static int inputInteger() {
		return (Integer.parseInt(scanner.next()));
	}
       //for getting string as user input..
	public static String inputString() {
		return (scanner.nextLine());
	}

	/* Static method for reading data from file */
	public static String[] readfile(String[] word) throws IOException, FileNotFoundException {
		File file = new File("/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/data_structure/NumbersOrdered");
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String string = bufferedReader.readLine();
			while ((bufferedReader.readLine()) != null) {
				string = string + bufferedReader.readLine();
				// System.out.println(string);
			}
			word = string.split(" ");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			bufferedReader.close();
		}
//	System.out.println(string);
		return word;
	}

// palindrome checker using deque	
	public static boolean palindromCheker(String input) {
		input = input.toLowerCase().replaceAll(" ", "");
		Deque<Character> deque = new Deque<>();
		boolean result = false;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// adding each character to the rear of the deque
			deque.addRear(c);
		}
		int flag = 0;

		// traverse upto size of the deque greater than 1
		while (deque.size() > 1) {
			char first = (char) ((deque.removeFront())); // remove from front
			char last = (char) (deque.removeRear()); // remove from rear
			if (first == last) // if equal set flag to 0.
			{
				flag = 0;

			} else {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			result = true; // is palindrome
		} else {
			result = false; // not palindrome
		}
		return result;
	}

}
