package br.com.cod3r.memento.swing.component;

import br.com.cod3r.memento.swing.memory.Memento;

import javax.swing.*;

public class TextAreaWithMemory extends JTextArea {

	private static final long serialVersionUID = 2393587108160522742L;
	
	public TextAreaWithMemory(int rows, int columns) {
		super(rows, columns);
	}

	public TextAreaMemento save() {
		return new TextAreaMemento(getText());
	}

	public void restore(TextAreaMemento memento) {
		setText(memento.getState());
	}

	public static class TextAreaMemento implements Memento {

		private final String text;

		public TextAreaMemento(String text) {
			this.text = text;
		}

		private String getState() {
			return text;
		}
	}
}
