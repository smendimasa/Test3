/*
 * Sam Mendimasa
 * Amberg Pd:3
 * DeckOfCards.java
 * January 30, 2014
 * Create an array of deck of cards ad simulate shuffling and dealing the cards
 */

import java.util.ArrayList;
public class DeckOfCards {//begins DeckOfCards
	
	//instance variables use an ArrayList to create a deck of 52 Cards
	private ArrayList<Card> Deck;
	
	//constructor
	//instantiates a deck of 52 playing cards Ace - King in each suit
	public DeckOfCards(){
		
		Deck=new ArrayList<Card>(52);
		for(int i=1; i <=4; i++){
			for(int x=1; x<=13; x++){
				Card c= new Card (i, x);
				Deck.add(c);
			}
		}
	
	
	}
	
	//modifiers
	//simulates shuffling the deck of cards by randomizing the order of the deck
	
	public void shuffle(){
		int ran1, ran2;
		int size=Deck.size();
		ran1=  (int) (size*Math.random()+1); 
		ran2=  (int) (size*Math.random()+1); 
		
		for (int i = 0; i < size; i++) {
			ran1=  (int) ((size-1)*Math.random()+1); 
			ran2=  (int) ((size-1)*Math.random()+1); 
			
			while(ran1==ran2){
				
				ran2=  (int) ((size-1)*Math.random()+1); 
				
			}
			swap(ran1,ran2);
		      
		    }
	}
	
	//private method uses to help with shuffling the deck- swaps two cards in the deck
	private void swap(int i1, int i2){
		
		// Swap the values
		Card x1=Deck.get(i1);
		Card x2=Deck.get(i2);
		Deck.set(i1, x2);
		Deck.set(i2, x1);
	}
	
	//remove and returns card at top of deck
	public Card deal(){
		
		Card x1=Deck.get(0);
		System.out.println(x1+" was Dealt");
		return Deck.remove(0);
	}
	
	//accessors
	//return the number of cards remaining in the deck
	public int cardsRemaining(){
		return Deck.size();
		
	}
	
	//displays one card on each line
	public void displayDeck(){
		int x=0;
		while(x<Deck.size()){
		System.out.println(Deck.get(x));
		x++;
		}	
	}
	
	

}//ends DeckOfCards
