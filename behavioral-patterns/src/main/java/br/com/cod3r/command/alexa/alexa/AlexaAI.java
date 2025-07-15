package br.com.cod3r.command.alexa.alexa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {

    private Map<String, String[]> associations = new HashMap<>();

    public void addAssociation(String key, String[] association) {
        associations.put(key, association);
    }

    public String getFindAssociations(String request) {
        for (String[] association : associations.values()) {
            if (Stream.of(association).allMatch(request::contains)) {
                return getKeyFromAssociation(association);
            }
        }
        return null;
    }

    public String getKeyFromAssociation(String... keywords) {
        return associations
                .entrySet()
                .stream()
                .filter(e -> Arrays.equals(keywords, e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Key don't found by keywords!"));
    }
}
