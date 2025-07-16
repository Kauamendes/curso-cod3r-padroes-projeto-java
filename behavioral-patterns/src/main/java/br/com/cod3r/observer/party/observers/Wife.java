package br.com.cod3r.observer.party.observers;

public class Wife implements Observer {

	public void update(boolean status) {
		if (status) {
			partyTime();
		} else {
			System.out.println("Hold!");
		}
	}
	
	public void partyTime() {
		System.out.println("Let´s Party! :D");
	}
}