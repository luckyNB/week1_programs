package com.designpattern.singleton;

import java.util.LinkedList;

public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("Instance ID" + System.identityHashCode(singleton));
		System.out.println(singleton.getLetterList());
		LinkedList<String> playeOneTiles = singleton.getTiles(7);
		
		System.out.println("Player 1:" + playeOneTiles);
		System.out.println(singleton.getLetterList());
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.getLetterList());
		LinkedList<String> playeOneTiles2 = singleton.getTiles(7);
		
		System.out.println("Instance ID 2" + System.identityHashCode(singleton2));

		System.out.println("Player 2:" + playeOneTiles2);
		System.out.println(singleton2.getLetterList());
	}
}
