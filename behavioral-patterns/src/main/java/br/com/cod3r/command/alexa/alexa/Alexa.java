package br.com.cod3r.command.alexa.alexa;

import br.com.cod3r.command.alexa.command.Command;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class Alexa {

	private static final String LIVING_ROOM_LIGHT = "LivingRoomLight";
	private static final String KITCHEN_LIGHT = "KitchenLight";
	private final Map<String, Command> integrations;
	private AlexaAI alexaAI;
	
	public Alexa() {
		integrations = new HashMap<>();
		alexaAI = new AlexaAI();
	}

	public void addIntegration(String key, Command command, String... keywords) {
		integrations.put(key, command);
		alexaAI.addAssociation(key, keywords);
	}

	public void sendRequest(String request) {
		Command command = integrations.get(request);
		if (isNull(command)) {
			String key = alexaAI.getFindAssociations(request);
			command = integrations.get(key);
			if (isNull(command)) {
				System.out.println("Sorry, I can't perform your request!");
				return;
			}
		}
		System.out.println("Send a generic command as you saved in my configures");
		command.execute();
	}
}
