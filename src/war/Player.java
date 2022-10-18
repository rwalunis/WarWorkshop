package war;

import java.util.ArrayList;
import java.util.List;

public class Player {

//Have built-out in advance: Player fields, getters/setters, constructor
//Build out live: 1: drawCardIntoHand and 2: describe (at very end after creating createCard method in CARD class live)	

	private String name;
	private int score;
	private List<Card> hand = new ArrayList<>();

	public Player(String name) {
		this.score = 0;
		this.name = name;

	}

// This method below draws, and then adds that drawn card to a player's hand.		
	public void drawCardIntoHand(Deck deck) { 							
		hand.add(deck.drawCardFromDeck());
	}

	public void describePlayer() {
		System.out.println("Player name: " + name);
		for (Card card : hand) {
			card.describeCard();
		}
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;

	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public Card getCard() {
		return getCard();
	}
}
