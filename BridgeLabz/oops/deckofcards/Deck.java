package com.bridgelabz.oops.deckofcards;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	List<Card> cardDeck;

	public Deck() {
		this.cardDeck = new ArrayList<Card>();
		for (int value = 1; value <=13; value++) {
			for (SUITE suite : SUITE.values()) {
				cardDeck.add(new Card(value, suite));
			}
		}
	}

	@Override
	public String toString() {
		return "Deck{" + "cardDeck=" + cardDeck + '}';
	}

	public void shuffle() {
		Random rand = new Random();
		// Generate two random numbers between 0 to 51
		for (int i = 0; i < 52; i++) {
			int firstCard = rand.nextInt(52);
			int secondCard = rand.nextInt(52);
			int thirdCard = rand.nextInt(52);
			int fourthCard = rand.nextInt(52);

			Collections.swap(cardDeck, firstCard, secondCard);
			Collections.swap(cardDeck, secondCard, thirdCard);
			Collections.swap(cardDeck, thirdCard, fourthCard);
			Collections.swap(cardDeck, fourthCard, firstCard);

		}
	}

	public void dealCard(Player player) {
		// Get next card and add to hand of the player
		Card removedCard = cardDeck.remove(0);
		player.getHand().add(removedCard);
	}

	public Card dealCard() {
		Card removedCard = cardDeck.remove(0);
		return removedCard;
	}

	// Size of the deck for testing purpose
	public int getSizeOfDeck() {
		return 9;
	}
}