package com.bridgelabz.data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author  : Laxman Bhosale
 * @purpose : Program for Hashing method storing the data in appropriate
 *             position ...
 * @Date    : 10/03/2019
 * 
 */

public class Hashing {
	public static LinkList slot[] = new LinkList[11];// Array of linked List
	public static Scanner scanner = new Scanner(System.in);

	// takes the string input
	public static String stringInput(String s) {
		System.out.print(s);
		String string = scanner.nextLine();

		return string;
	}
	// method for getting the appropriate slot/location of element
		public static int hash(String str) {
			int index = Integer.parseInt(str) % 11;

			return index;
		}

	// main method
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/data_structure/Numbers";
		for (int i = 0; i < 11; i++) {
			slot[i] = new LinkList();// allocation of memory to the linked list
		}

		BufferedReader brBufferedReader = new BufferedReader(new FileReader(path));// for reading the data from the file
		try {
			String str = brBufferedReader.readLine();

			System.out.println(str);

			String[] strA = str.split(" ");
			for (int i = 0; i < strA.length; i++) {
				int slotNum = hash(strA[i]);// for getting the location/slot for storing the element.
				slot[slotNum].add(strA[i]);// adding the element at appropriate location as per remainder
				// System.out.print(slot[slotNum]);
			}
			System.out.println();

			for (int i = 0; i < 11; i++) {
				System.out.print(i + "==> ");
				slot[i].displayList();
			}

			String key = stringInput("enter the element to search: ");
			int slotNumber = hash(key);
			boolean value = slot[slotNumber].search(key);
			if (value) {
				System.out.println("\nElement found at slot " + slotNumber + " and deleted\n");
				slot[slotNumber].remove(key);
			} else {
				System.out.println("\nElement not found but added: " + key + " at slot " + slotNumber + "\n");
				slot[slotNumber].add(key);
			}

			System.out.println();
			for (int i = 0; i < 11; i++) {
				System.out.print(i + "==> ");
				slot[i].displayList();
			}

			String s = "";
			for (int i = 0; i < 11; i++) {
				s = s + slot[i].toString();
			}
			System.out.println("New elements in file:\n" + s);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));// for writing the data into the
																						// file
			bufferedWriter.write(s);

			bufferedWriter.close();
			brBufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}