package com.bridgelabz.data_structure;

import java.io.FileNotFoundException;

import java.io.IOException;

/**
 * @author  : Laxman Bhosale
 * @purpose : Program for Hashing method storing the data in appropriate
 *                      position ...
 * @Date    : 10/03/2019
 * 
 */
//import com.bridgelabz.data_structure.LinkedList;
public class OrderedLinkedList {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String element;
		LinkedList wordlist = new LinkedList();
		String word[] = null;
		word = Utility.readfile(word);
		// System.out.println(word);
		// DSUtility.printString(word);
		for (String item : word) {
			wordlist.insertAtLast(item);
		}
		wordlist.printlist();
		wordlist.sortList();
		wordlist.printlist();
		System.out.println("####################################");
		System.out.println("Enter the element to be inserted:");
		element = Utility.inputString();
//	boolean found=DSUtility.serachString(word, element);
		boolean found = wordlist.search(element);
		if (found) {
			wordlist.delete(element);
		} else {
			wordlist.insertAtLast(element);
			// wordlist.
		}
        wordlist.sortList();
		wordlist.printlist();
		wordlist = Utility.writefile(wordlist);
		wordlist.printlist();
	}
}
