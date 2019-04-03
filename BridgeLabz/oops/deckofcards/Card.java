package com.bridgelabz.oops.deckofcards;



//Each card has a value and a suite.
public class Card {
	int value;
	SUITE suite;

	public Card() {

	}

	public Card(int value, SUITE suite) {
		this.value = value;
		this.suite = suite;
	}

	public int getValue() {
		return value;
	}

	public SUITE getSuite() {
		return suite;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setSuite(SUITE suite) {
		this.suite = suite;
	}

	// @Override
	public String toString() {
		return "Card{" + "value=" + value + ", suite=" + suite + '}';
	}
}