package com.bridgelabz.data_structure;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnOrderList<T> {

	Node head;
	int length = 0;

	class Node<T> // node class
	{
		T data; // node data
		Node<T> next; // node reference

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	// add elements to linked list
	public Node add(T data) {
		Node new_node = new Node(data);
		Node temp = head;
		if (head == null) // if no element present in List
		{
			head = new_node; // new node will be head
			length++;
			return head;
		}
		while (temp.next != null) // traverse upto temp.next become null
		{
			temp = temp.next;
		}
		temp.next = new_node; // add element when next is null
		length++;
		new_node.next = null; // assign next as null coz it is last node
		return head;
	}

//add first
	public void addFirst(T data) {
		Node new_node = new Node(data);
		if (head == null) // check if list is empty
		{
			head = new_node; // if yes then added element will be head
			length++;
			new_node.next = null;
			return;
		}
		new_node.next = head; // else new node will store reference of current head node
		head = new_node; // new node will be head node
		length++;
	}

//inset at position
	public void addAt(int position, T data) {
		Node new_node = new Node(data); // create new node
		int count = 1;
		Node temp = head; // create temp node to traverse the list and assign head to temp
		Node prev = temp;
		while (temp != null && count <= position) // check for position
		{
			prev = temp; // get previous
			temp = temp.next;
			count++;
			if (count == position) {
				prev.next = new_node; // assign reference of new node to the previous node
				new_node.next = temp; // store reference of next node into new node
				length++;
				break;
			}
		}

	}

//remove first element
	public void removeFirst() {
		if (length == 0) // check if list is empty
		{
			System.out.println("No element present in List");
			return;
		}
		head = head.next; // else shift head to next
		length--;
	}

//remove last element
	public void pop() {

		Node prev_node = head;
		Node temp = head;
		if (length == 0) // check for empty
		{
			System.out.println("No element present in List");
			return;
		}
		while (temp.next != null) // get last element
		{
			prev_node = temp;
			temp = temp.next;
		}
		prev_node.next = null; // change reference of previous node as null bcz now it is last element
		length--;
	}

//find length
	public int size() {
		return length;
	}

//search data in UnOrderLinkedList
	public int positionOf(T data) {
		int count = 1;
		Node temp = head;
		if (head.data.equals(data)) // compare head data with user entered data
		{
			return count;
		}
		while (temp.next != null) // traverse till last node
		{
			temp = temp.next; // increment node
			count++;
			if (temp.data.equals(data)) // if data found,return position
			{
				return count;
			}
		}
		if (count == length) // if data is not present
		{
			System.out.println("data not present");
		}
		return 0;
	}

//print linkedlist
	public void display() {
		System.out.println("\nyour linked list is:");
		Node n = head;
		if (head == null)
			System.out.println("null");
		while (n.next != null) // traverse till last
		{
			System.out.print(n.data + " "); // print data of node
			n = n.next;
		}
		System.out.print(n.data); // to print data of last node
		return;
	}

//first position element
	public <T> T firstElement() {
		return (T) head.data;
	}

//last position element
	public <T> T lastElement() {
		Node temp = head;
		int count = size();
		while (count != 0) // traverse till last node
		{
			temp = temp.next;
			count--;
		}
		return (T) temp.data; // return data of last node
	}

//element at particular position
	public <T> T get(int position) {
		Node new_node = head;
		int count = 1;
		if (position == 1) // if 1,return head
		{
			return (T) new_node.data;
		}
		T element;
		while (new_node.next != null) // else traverse
		{
			new_node = new_node.next; // increment
			count++;
			if (count == position) // when we reach that position then return data
			{
				element = (T) new_node.data;
				return (T) element;
			}
		}
		return null;
	}
//check my linkedlist is empty or not

	public boolean isEmpty() {
		return (length == 0);
	}

//check my element is present in linkedlist
	public boolean search(T data) {
		Node temp = head;
		if (head.data.equals(data)) {
			return true;
		}
		while (temp.next != null) // traverse list till last
		{
			temp = temp.next;
			if (temp.data.equals(data)) // if found return true
			{
				return true;
			}
		}
		return false; // else false

	}

//remove data element from linkedlist
	public void remove(T data) {
		Node temp = head;
		Node prev = temp;
		if (temp.data.equals(data)) // if data is found at head
		{

			head = temp.next;// change head to next
			length--;
			return;
		}
		while (temp.next != null) {
			prev = temp; // get previous of deleting node
			temp = temp.next;
			if (temp.data.equals(data)) {
				prev.next = temp.next; // change reference of previous node with next of deleting node
				length--;
			}
		}

	}

//remove at position
	public void popAt(int position) {

		int count = 1;
		Node temp = head;
		Node prev = temp;
		while (temp != null && count <= position) {
			prev = temp;
			temp = temp.next;
			count++;
			if (count == position) //// when we reach that position then return data

			{
				prev.next = temp.next;
				length--;
				return;

			}
		}
	}
}