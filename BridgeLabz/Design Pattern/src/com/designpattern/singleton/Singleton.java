package com.designpattern.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;
	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "e", "e", "e", "e", "e", "i", "i",
			"i", "i", "i", "e", "e", "e", "e", "e", "e", "o", "o", "o", "o", "o", "o", "x", "x", "x", "x", "x", "z",
			"z", "z", "z", "z", "z", "m", "m", "m", "m", "m", "m", };

	private Singleton() {
	}

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	static boolean firstThread = true;

	public static Singleton getInstance() {
		if (firstInstance == null) {
			if (firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			firstInstance = new Singleton();
			Collections.shuffle(firstInstance.letterList);
			
		}
		return firstInstance;
	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for (int i = 0; i < howManyTiles; i++) {
tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}

}
