package main;

public enum PresentEnumerable {
	DAY_ONE("Partridge(s) in a Pear Tree"),
	DAY_TWO("Turtle Doves"),
	DAY_THREE("French Hens"),
	DAY_FOUR("Calling Birds"),
	DAY_FIVE("Gold Rings"),
	DAY_SIX("Geese a-Laying"),
	DAY_SEVEN("Swans a-Swimming"),
	DAY_EIGHT("Maids a-Milking"),
	DAY_NINE("Ladies Dancing"),
	DAY_TEN("Lords a-Leaping"),
	DAY_ELEVEN("Pipers Piping"),
	DAY_TWELVE("Drummers Drumming");
	
	String present;
	
	PresentEnumerable(String present) {
		this.present = present;
	}
	
	public String getPresent() {
		return this.present;
	}
}
