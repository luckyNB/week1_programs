package com.bridgelabz.oops.deckofcards;
/***************************************************************************
 * @author : Laxman Bhosale

 * @purpose: Distributing a well shuffled  Deck of Cards to 4 player with
 *           9 cards and priting them.
 ***************************************************************************/

public class Main {
	public static void main(String args[]) {
		Deck deck = new Deck();
		System.out.println(deck);
		System.out.println("Size of deck is: " + deck.getSizeOfDeck());

		//Iterator<Deck> iteratorDeck=deck.iterator();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);

	}
}