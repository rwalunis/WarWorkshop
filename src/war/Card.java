package war;

public class Card {
	
<<<<<<< HEAD
//go over getters/setters, field variables, constructor for Card (built-in-advance)
//create describeCard method LAST LIVE	
=======
//go over getters/setters, field variables, constructor for Card (built-in advance)	
>>>>>>> 9d1a9b6a58510a37df5fb4e037d0905922615b42

	private String name;
	private int value;

	public Card(int value, String suit) {

		switch (value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;

		}
		name += " of " + suit;
		this.value = value;
	}

	public void describeCard() {
		System.out.println("The name of card is: " + name + "," + " Card value: " + value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;

	}

}

