package com.bridgelabz.oops.deckofcards;


import java.util.ArrayList;

import java.util.List;

public class Player {
	List<Card> hand;

	public Player() {
		this.hand = new ArrayList<Card>();
	}

	public List<Card> getHand() {
		return hand;
	}

	@Override
	public String toString() {
		return "Player{" + "hand=" + hand + '}';
	}
}