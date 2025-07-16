package br.com.cod3r.observer.party.subject;

import java.util.Objects;

public class Doorman extends Subject {

	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		if (!Objects.equals(newStatus, status)) {
			notifyObservers(newStatus);
		}
		this.status = newStatus;
	}
}
