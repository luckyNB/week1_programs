package com.bridgelabz.data_structure;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnOrderedListMainClass
{          /*static method for reading data from the file*/
	public static String readFile(String path) throws FileNotFoundException {
		Scanner file = new Scanner(new File(path)); // file path
		String str = ""; // define an empty string
		while (file.hasNext()) // if file is having next data
		{
			str = str + file.nextLine(); // read line from file and concat to str
		}
		file.close(); // close the file after reading
		return str;
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner scanner=new Scanner(System.in);
	  UnOrderList<String> list = new UnOrderList<>();	
	 String file = ("/home/admin1/Desktop/Demo.txt");//path of file
				 String str = readFile(file);  
	    	     String array[] =str.split(" "); // add element into array
	    	     for(int i = 0; i < array.length;i++)
	    	     {
	    	    	 list.add(array[i]);                  //add element to list    
	    	     }
	    	     list.display(); //display list
	    	    
	    	     System.out.println("\n\nEnter which word you want to search:");
	    	     String search = scanner.nextLine();//seraching element
	    	     
	  
	    	     if(list.search(search))     //if found then remove
	    	     {
	    	    	 System.out.println("your word found..");
	    	    	 list.remove(search);
	    	    	 System.out.println("found word removed....");
	    	     }
	    	     else 
	    	     {
	    	    	 System.out.println("your word not found..");	//if not found,then add
	    	    	 list.add(search);
	    	    	 System.out.println("your word added to linked list....");
	    	     }
	    	     list.display();                      //display new list
	    	    
	   
	    	    }
}