package com.bridgelabz.data_structure;

import java.util.ArrayList;

/**
 * @author : Laxman Bhosale
 * @purpose: Program for finding the prime anagram numbers and adding them to
 *            queue and printing them 
 *          
 * @Date   :   08/03/2019
 * 
 */

public class PrimeAnagramQueue {

	static String arr[][] = new String[13][13];
	static int counter = 0;
	public static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public static ArrayList<Integer> primeAnagramList = new ArrayList<Integer>();

	public static LinkedList linkList = new LinkedList();

	public static void primeAnagrams() {//for checking number is prime or not

		System.out.println();
		boolean flag;
		for (int j = 2; j <= 1000; j++) {
			flag = true;
			for (int i = 2; i < j / 2; i++) {// for checking prime numbers
				if (j % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				arrayList.add(j);//if prime then added to the list
		}
		// for checking the number is anargam or not if anagram then add to the list
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (anagram(arrayList.get(i), arrayList.get(j))) {//if number is anagram then add it to list
					// System.out.println(arrayList.get(i) + " " + arrayList.get(j));
					primeAnagramList.add(arrayList.get(i));
					primeAnagramList.add(arrayList.get(j));
					
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

	public static void enqueue()//method for adding prime anagram numbers to the queue
	{
		for (int i = 0; i < primeAnagramList.size(); i++) {
			linkList.insertAtLast(primeAnagramList.get(i));
		}

	}

	public static void dequeue() //method for printing all queue elements
	{
		if (linkList.isEmpty())
			System.out.println("List is empty");
		else {
			linkList.printlist();
			
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

	public static void main(String[] args) {
		/* Prime anagram list using queue data strucure */
		primeAnagrams();// for finding prime anagram numbers
		enqueue();// for inserting prime anagram numbers in the queue
		dequeue();// for displaying the number from the queue
	}
}
