package com.bridgelabz.algorithm;

import java.util.ArrayList;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for finding out the number which are prime as well as anagram and both must be prime.
* @Date   : 13/02/2019          
*/
public class AnagramPrimeNumber {

	static String arr[][] = new String[13][13];
	static int counter = 0;
	public static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public static ArrayList<Integer> primeAnagramList = new ArrayList<Integer>();

	public static void primeAnagrams() {

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
					primeAnagramList.add(arrayList.get(i));
				}
			}
		}
	}

	/* Method for checking anagram or not */
	public static boolean anagram(int n1, int n2) {
		int[] n1count = counting(n1);
		int[] n2count = counting(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	public static void storeQueue() {
		
	
	
	}

	public static void disp2DArray() {
		counter = 0;
		for (int i = 0; i < 13; i++) {

			for (int j = 0; j < 13; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	public static int[] counting(int num) {
		int[] count = new int[10];
		int temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			count[rem]++;
			temp = temp / 10;
		}
		return count;
	}

	static int count = 0;

	public static void main(String[] args) {

		System.out.println("Prime Anagram numbers between 1 and 1000");

		primeAnagrams();
		System.out.println(arrayList.size());
		// storeIn2DArray();
		// disp2DArray();

		System.out.println(arrayList.size());
	}

}
