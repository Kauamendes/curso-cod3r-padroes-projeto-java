package br.com.cod3r.observer.swing;

import javax.swing.*;
import java.util.Arrays;

public class Button extends JButton {

    public Button(String text, Label... labels) {
        super(text);
        addActionListener(e -> Arrays.stream(labels).forEach(Label::increment));
    }
}
