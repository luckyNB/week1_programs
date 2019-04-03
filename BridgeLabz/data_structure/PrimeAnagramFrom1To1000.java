package com.bridgelabz.data_structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Laxman Bhosale
 * @purpose: Program for finding out the number which are prime as well as
 *           anagram and both must be prime
 * @Date : 05/03/2019
 */

public class PrimeAnagramFrom1To1000 {

	static Integer arr[][] = new Integer[13][13];
	static int counter = 0;
	public static List<Integer> arrayList = new ArrayList<Integer>();
	public static ArrayList<Integer> primeAnagramList1 = new ArrayList<Integer>();
	public static ArrayList<Integer> primeAnagramList2 = new ArrayList<Integer>();

	public static ArrayList<Integer> list[] = new ArrayList[10];

	//public static List<Integer> list1 = new ArrayList();

	/* static function for finding the number is anagram or not */
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
					/// System.out.println(arrayList.get(i) + " " + arrayList.get(j));
					// list.addAll(arrayList.get(i), arrayList.get(j));
					primeAnagramList1.add(arrayList.get(i));
					primeAnagramList1.add(arrayList.get(j));

				} else {

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

	/* static method for combining arraylist */
	
	/* static method for displaying 2D matrix array */
	public static void disp2DArray() {

		for (int i = 0; i < 13; i++) {

			for (int j = 0; j < 13; j++) {
			//	System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	public static void storeIn2DArray() {
		for (int i = 0; i < 10; i++) {
			list[i] = new ArrayList();
		}
		for (int i = 0; i < primeAnagramList1.size(); i++) {
		if(counter<primeAnagramList1.size()) {
			if (primeAnagramList1.get(i) > 0 && primeAnagramList1.get(i) < 100) {
				list[0].add(primeAnagramList1.get(i));
			}
			else if (primeAnagramList1.get(i) > 100 && primeAnagramList1.get(i) < 200) {
				list[1].add(primeAnagramList1.get(i));
			}
			else if (primeAnagramList1.get(i) > 200 && primeAnagramList1.get(i) < 300) {
				list[2].add(primeAnagramList1.get(i));
			} 
			else if (primeAnagramList1.get(i) > 300 && primeAnagramList1.get(i) < 400) {
				list[3].add(primeAnagramList1.get(i));
			} 
			else if (primeAnagramList1.get(i) > 400 && primeAnagramList1.get(i) < 500) {
				list[4].add(primeAnagramList1.get(i));
			}
			else if (primeAnagramList1.get(i) > 500 && primeAnagramList1.get(i) < 600) {
				list[5].add(primeAnagramList1.get(i));
			} 
			else if (primeAnagramList1.get(i) > 600 && primeAnagramList1.get(i) < 700) {
				list[6].add(primeAnagramList1.get(i));
			} 
			else if (primeAnagramList1.get(i) > 700 && primeAnagramList1.get(i) < 800) {
				list[7].add(primeAnagramList1.get(i));
			}
			else if (primeAnagramList1.get(i) > 800 && primeAnagramList1.get(i) < 900) {
				list[8].add(primeAnagramList1.get(i));
			}
			else if (primeAnagramList1.get(i) > 900 && primeAnagramList1.get(i) < 1000) {
				list[9].add(primeAnagramList1.get(i));
			}
		}
			
		counter++;
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
		
		storeIn2DArray();
		System.out.println(primeAnagramList1);
		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);
		}
	}

}
