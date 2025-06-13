package br.com.cod3r.flyweight.map.model;

public class PixelType {

	private final char character;
	private final int treasureReward;

	public PixelType(Character character, Integer treasureReward) {
		this.character = character;
		this.treasureReward = treasureReward;
	}

	public Character getCharacter() {
		return character;
	}
	
	public Integer getTreasureReward() {
		return treasureReward;
	}
}
