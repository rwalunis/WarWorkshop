package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//Have field variables, getters, setters, constructor for deck of cards build in advance
//Build method (draw) live	 

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {

		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Diamonds");
			cards.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Hearts");
			cards.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Spades");
			cards.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Clubs");
			cards.add(card);
		}

	}

// This method below gets and removes the first card from the deck of 52 cards
	public Card drawCardFromDeck() {
		Card drawnCard = cards.get(0);
		cards.remove(drawnCard);
		return drawnCard;
	}

}
