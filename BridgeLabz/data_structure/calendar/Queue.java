package com.bridgelabz.data_structure.calendar;


public class Queue<T> 
{
	@SuppressWarnings("rawtypes")
	Node head;
	int length = 0;
	@SuppressWarnings("hiding")
	class Node<T>
	{
		T data;
		@SuppressWarnings("rawtypes")
		Node next;
		 Node(T data)
		{
			this.data = data;
			next = null;
		}
		
	}
	

//add element in queue

@SuppressWarnings({ "rawtypes", "unchecked" })
public Node enque(T data)
{
	
	@SuppressWarnings("unchecked")
	Node new_node = new Node(data);  //create new node
	Node temp = head;
	if(head == null)  // if no element present in queue new node will be head
	{
		head = new_node;
		length++;
		return head;
	}
	while(temp.next != null) // traverse till last node
	{
		temp = temp.next;
	}
	temp.next = new_node; // add element after present element
	length++;
	new_node.next = null;
	return head;
}

//remove first in element

@SuppressWarnings("rawtypes")
public String deque()
{
	Node temp=head;
	if(length == 0)  //if queue is empty
	{
		System.out.println("No element present in List");
		return " ";
	}
	head = head.next;  //else shift head to next node
	length--;
	return (String) temp.data;
	
}

//check queue is empty or not

public boolean isEmpty()
{
	return(length == 0);
}

//find size 
public int size()
{
	return length;
}

//return first element from queue

@SuppressWarnings("hiding")
public <T>T topElement()
{
	return (T)head.data;
}

//print queue
@SuppressWarnings("rawtypes")
public void display()
{
	Node new_node = head;
	int size = size();
	for(int i = 0 ; i <size;i++)  //traverse till last
	{
		System.out.print(new_node.data+" ");
		new_node = new_node.next;
		
	}
	
	return;
}

//get element at perticular position
public <T>T get(int position)
{
	Node new_node = head;
	int count = 1;
	if(position == 1)  //if position is 1,return head data
	{
		return (T) new_node.data;
	}
	T element;
		while(new_node.next != null)  //to traverse till last
		{
		new_node = 	new_node.next;
		count++;
		if(count == position)   //when reached that position,return data
		{
			element = (T)new_node.data;
			return (T) element;
		}
		}
	return null ;
}
}