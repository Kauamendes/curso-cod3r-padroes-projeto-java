package br.com.cod3r.mediator.swing.components;

import br.com.cod3r.mediator.swing.mediator.Mediator;

import javax.swing.*;

public class AddButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;

    public AddButton(Mediator mediator) {
		super("Click me!");
        this.addActionListener(e -> mediator.buttonClicked());
	}
}
