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
//
//		Player player1 = new Player();
//		Player player2 = new Player();
//		Player player3 = new Player();
//		Player player4 = new Player();

//		deck.dealCard(player1);
//		System.out.println("Size of deck after dealing a card to player is " + deck.getSizeOfDeck());
//		deck.dealCard(player2);
//		System.out.println("Size of deck after dealing a card to player is " + deck.getSizeOfDeck());
//		deck.dealCard(player3);
//		System.out.println("Size of deck after dealing a card to player is " + deck.getSizeOfDeck());
//		deck.dealCard(player4);
//		System.out.println("Size of deck after dealing a card to player is " + deck.getSizeOfDeck());

//		System.out.println("Hand of player 1 is " + player1.getHand());
//		System.out.println("Hand of player 2 is " + player2.getHand());
//		System.out.println("Hand of player 3 is " + player3.getHand());
//		System.out.println("Hand of player 4 is " + player4.getHand());

		//player1.getHand().add(deck.dealCard());
	}
}