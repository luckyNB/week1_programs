package com.bridgelabz.data_structure;
import com.bridgelabz.data_structure.Node;


public class LinkedList {
	Node head = null;

	public void printlist() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");

			temp = temp.next;

		}

		System.out.println(temp.data + " ");
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}

	public <T> void insertAtLast(T data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
			node.next = null;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			node.next = null;
			n.next = node;
		}
	}

	public <T> void delete(T element) {
		Node temp = head;
		Node prev = head;
		if (temp.data.equals(element)) {
			head = temp.next;
			return;
		}
		while (temp.next != null) {
			{
				if (element.equals(temp.data)) {
					prev.next = temp.next;
					return;
				}
				prev = temp;
				temp = temp.next;
			}
		}
		prev.next = null;
	}

	public <T> T deletefirst() {
		T item;
		Node temp = head;
		head = temp.next;
		item = (T) temp.data;
		return item;
	}

	public <T> T deleteAtlast() {
		if (head == null)
			return null;
		else {
			Node temp = head;
			Node prev = head;
			while (temp.next != null) {
				prev = temp;

				temp = temp.next;

			}

			T data = (T) temp.data;
			prev.next = null;
			return data;
		}
	}
//for searching the element from the linked list
	public <T> boolean search(T element) {
		Node temp = head;
		while (temp != null) {
			if (element.equals(temp.data)) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}
//for sorting the linked list
	public void sortList() {
		Node temp = head;
		Node prev;
		prev = temp.next;
		while (temp.next != null) {
			while (prev != null) {
				int a = Integer.parseInt((String) temp.data);
				int b = Integer.parseInt((String) prev.data);
				if (a > b) {
					int t = a;
					temp.data = String.valueOf(b);
					prev.data = String.valueOf(t);
				}
				prev = prev.next;
			}
			temp = temp.next;
			prev = temp.next;
		}
	}
//for getting last element from the list
	public <T> T getlast() {
		Node temp = head;
		while (temp.next == null) {
			temp = temp.next;
		}
		return (T) temp.data;
	}
	//for getting  elements from the list

	public <T> T get() {
		Node temp = head;
		if (temp.next == null) {
			return (T) temp.data;
		}
		head = temp.next;
		return (T) temp.data;
	}

}
