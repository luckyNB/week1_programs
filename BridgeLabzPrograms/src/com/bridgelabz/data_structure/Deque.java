package com.bridgelabz.data_structure;

public class Deque<T> {
	Node head;
	int length = 0;

	class Node<T> {
		T data; // node data
		Node next; // node reference

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	// add element at first

	public void addFront(T data) {
		Node new_node = new Node(data);
		if (head == null) // if queue is empty
		{
			head = new_node;
			length++;
			new_node.next = null;
			return;
		}
		new_node.next = head; // new node reference will be current head
		head = new_node; // set newnode as head
		length++;
	}

	// add element at rear

	public void addRear(T data) {
		Node new_node = new Node(data);
		Node temp = head;

		if (head == null) // if no element present in List
		{
			head = new_node;
			length++;
			return;
		}
		while (temp.next != null) // traverse upto last node
		{
			temp = temp.next;
		}
		temp.next = new_node;// add element after present element
		length++;
		new_node.next = null;
	}

	// remove element from front
	public <T> T removeFront() {
		T first = frontElement(); // get first element
		if (length == 0) // check if queue is empty
		{
			System.out.println("No element present in List");
			return null;
		}
		head = head.next; // if not empty,shift head to next
		length--;
		return first;

	}

	// remove element from rear

	public <T> T removeRear() {
		T lastElement = lastElement();
		Node prev_node = head;
		Node temp = head;
		if (length == 0) // check if queue is empty
		{
			System.out.println("No element present in List");
			return null;
		}
		while (temp.next != null) // traverse till last
		{
			prev_node = temp;
			temp = temp.next;
		}
		prev_node.next = null; // set previous.next to null
		length--;
		return lastElement;
	}

	// check my dequeue is empty

	public boolean isEmpty() {
		return (length == 0);
	}

	// check size

	public int size() {
		return length;
	}

	// return front element
	public <T> T frontElement() {
		return (T) head.data;
	}

	// return last element

	public <T> T lastElement() {
		Node temp = head;
		while (temp.next != null) // traverse till last
		{
			temp = temp.next;

		}
		return (T) temp.data; // return data of last node
	}

	// display
	public void display() {
		Node new_node = head;
		int size = size();

		for (int i = 0; i < size; i++) // traverse upto last
		{

			System.out.print(new_node.data + " ");// print node data

			new_node = new_node.next;

		}

		return;
	}
}
