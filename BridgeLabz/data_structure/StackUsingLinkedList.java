package com.bridgelabz.data_structure;

import static java.lang.System.exit;


/**
 * @author  : Laxman Bhosale

 * @purpose : Program for printing the prime anagram numbers  between 1 to 1000 using stack data structure..
 *            position ...
 * @Date    : 05/03/2019
 * 
 */

import java.util.ArrayList;

//Create Stack Using Linked list 
class StackUsingLinkedlist {

	public static int data = 0;
	static String arr[][] = new String[13][13];
	static int counter = 0;
	// static int top=-1;
	public static Node top;
	public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public static void primeAnagrams() {

		System.out.println();
		boolean flag;
		for (int j = 2; j <= 1000; j++) {
			flag = true;
			for (int i = 2; i < j / 2; i++) {// checks number is prime or not
				if (j % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)// if prime number then added to the list

				arrayList.add(j);
		}

		// for checking number is anagram or not if it is anagram then pushed
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (anagram(arrayList.get(i), arrayList.get(j))) {
					// System.out.println(arrayList.get(i) + " " + arrayList.get(j));
					push(arrayList.get(i).intValue());
					push(arrayList.get(j).intValue());

				}
			}
		}
	}

	/* Method for checking anagram or not */
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

	/* static method for creating array for incrementing the positions */
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

	static int count = 0;

	// A linked list node
	public static class Node {

		int data; // integer data
		Node link; // reference variavle Node type
	}
	// create globle top reference variable

	// Constructor
	StackUsingLinkedlist() {
		this.top = null;
	}

	// Utility function to add an element x in the stack
	public static void push(int x) // insert at the beginning
	{
		// create new node temp and allocate memory
		Node temp = new Node();

		// check if stack (heap) is full. Then inserting an
		// element would lead to stack overflow
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

		// initialize data into temp data field
		temp.data = x;

		// put top reference into temp link
		temp.link = top;

		// update top reference
		top = temp;
		data++;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Utility function to pop top element from the stack
	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).link;
	}

//function for displaying the element in the stack
	public static void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d->", temp.data);

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}
}

//main class 
public class StackUsingLinkedList {
	public static void main(String[] args) {

		StackUsingLinkedlist.primeAnagrams();
		System.out.println("The number of prime anagram are pushed" + StackUsingLinkedlist.data);
		// System.out.println(StackUsingLinkedlist.arrayList);
		StackUsingLinkedlist.display();
	}
}