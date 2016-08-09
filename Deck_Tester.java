/*
 * Sam Mendimasa
 * Amberg Pd:3
 * Deck_Tester.java
 * January 30, 2014
 * Tester for DeckOfCards. Will display cards, unshuffle, shuffle, amount of cards and dealing cards
 */

public class Deck_Tester {//begins Deck_Tester

	
	public static void main(String[] args) {//begins main
		
		//variables
		DeckOfCards x1= new DeckOfCards();
		
		System.out.println("Displaying Original Deck of Cards..UNSHUFFLE: ");
		x1.displayDeck();
		x1.shuffle();
		System.out.println("**************************************************\nDisplaying 'SHUFFLE' Deck of Cards\n***************************************");
		x1.displayDeck();
		System.out.println("************************************************\n*****************************************************\nThe Amount of Cards in the Deck is: "+x1.cardsRemaining());
		
		x1.deal();
		x1.deal();
		x1.deal();
		
		System.out.println("************************************************\n*****************************************************\nThe Amount of Cards in the Deck is: "+x1.cardsRemaining());
		System.out.println("Displaing Cards in Deck: ");
		x1.displayDeck();
	
		x1.shuffle();
		System.out.println("**************************************************\nDisplaying 'SHUFFLE' Deck of Cards\n***************************************");
		x1.displayDeck();
		System.out.println("************************************************\n*****************************************************\nThe Amount of Cards in the Deck is: "+x1.cardsRemaining());
		

	}//ends main

}//ends Deck_Tester
