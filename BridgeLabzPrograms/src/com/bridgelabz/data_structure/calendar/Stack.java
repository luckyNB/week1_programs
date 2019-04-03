package com.bridgelabz.data_structure.calendar;


public class Stack<T>
{

Node head;

int top = -1;
static class Node<T>
{
	T data;
	Node<T> next;
	 Node(T data)
	 {
		this.data =data;
		this.next = null;
	 }
}


//push element in stack
 public void push(T data)
 {
	 Node new_node = new Node(data);
	 Node temp=head;
	 if(head == null)
	 {
		 head = new_node;
		 top++;
		 return;
	 }

	while(temp.next!=null)
	{
		
		temp=temp.next;
	}
	top++;
	temp.next=new_node;
	new_node.next=null;
 }

 //check my stack is empty or not
 public boolean isEmpty()
 {
	 return (head==null);
 }

 //pop stack element
 public String pop()
 {
	
	 Node current = head;
	 head = current.next;
	 top--;
	 return (String) current.data;
 }

 //check size of stack
 public int size()
 {
	return top;
 }

 //print stack
 public void display()
 {
	 int size = size();
	 Node current = head;
	 for(int i = 0; i<= size;i++)
	 {
		 System.out.println(current.data+" ");
		 current = current.next;
	 }
 }


 
 //return top element of stack
 public <T>  T peek()
 {
	if(head.data == null)
	{
		System.out.println("no element present");
		return null;
	}
	 return (T) head.data;
 }

}

