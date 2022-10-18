/*
 * Overview: This workshop will be going over certain concepts related to the Java war project.
 * Please keep in mind that this project does not go over every method/step required by the final project
 * This workshop will go over the following: how to create a player, deck, card, and app class, 
 * How to create constructors and instantiation for a deck of cards, 
 * how to create a draw method in the player/deck class to build a player's 
 * hand of cards, and how to describe each player's card in their hand in the main app
 * REWORD THIS????????????????????
 */
package war;

public class App {
//Build this whole class out "live"
	public static void main(String[] args) {
//1. Instantiate a deck of cards.  This populates your deck of 52 cards.	
		Deck deckOfCards = new Deck();

//2. Instantiate two players.  This creates two players to play the game.	
		Player player1 = new Player("Rachael");
		Player player2 = new Player("Stephanie");

//3. Create a hand of cards (each player gets half the deck) through calling the drawCardIntoHand method 
//from the Player class with a for loop and if/else statement	
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) { // This loop ensures that each player is drawing half of the cards into their							// hand
				player1.drawCardIntoHand(deckOfCards);
			} else {
				player2.drawCardIntoHand(deckOfCards);
			}
		}
//4. How can we make sure that each Player was successfully given a hand of cards?		
//Create and deploy describeCard method in Card class and then describePlayer method from player class
		System.out.println(player1.getHand()); //this prints out the memory location of the card! not what we want
		player1.describePlayer(); //this prints out the actual value of the card from a player's hand

	}

}
