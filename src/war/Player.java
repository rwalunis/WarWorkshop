package war;

import java.util.ArrayList;
import java.util.List;

public class Player {

//Have built-out in advance: Player fields, getters/setters, constructor
//Build out live: drawCardIntoHand and describe (at very end)	

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

	public void describe() {
		System.out.println("Player name: " + name);
		for (Card card : hand) {
			card.describe();
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
