package br.com.cod3r.mediator.swing.components;


import br.com.cod3r.mediator.swing.mediator.Mediator;

import java.util.Objects;

public class State {

    private Mediator mediator;
	private int counter;

    public State(Mediator mediator) {
        this.mediator = mediator;
		counter = 0;
	}
	
	public void addCount() {
		counter++;
        if (Objects.equals(10, counter)) mediator.stop();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
