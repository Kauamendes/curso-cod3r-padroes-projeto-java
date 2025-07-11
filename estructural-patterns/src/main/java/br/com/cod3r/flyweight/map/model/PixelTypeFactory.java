package br.com.cod3r.flyweight.map.model;

import java.util.HashMap;
import java.util.Map;

public class PixelTypeFactory {

	private static PixelTypeFactory instance = new PixelTypeFactory();
	private static Map<Character, PixelType> pixelRepository;

	private PixelTypeFactory() {
		pixelRepository = new HashMap<>();
	}

	public static PixelTypeFactory getInstance() {
		return instance;
	}
	
	public PixelType getPixelType(Character character, Integer treasureReward) {
		PixelType pt = pixelRepository.get(character);
		if(pt == null) {
			System.out.println("Creating new Flyweight for " + character);
			pt = new PixelType(character, treasureReward);
			pixelRepository.put(character, pt);
		}
		return pt;
	}
}
