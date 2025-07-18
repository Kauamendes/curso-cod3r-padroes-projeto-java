package br.com.cod3r.strategy.worker;

import br.com.cod3r.strategy.worker.jobs.Developer;
import br.com.cod3r.strategy.worker.jobs.HispsterDeveloper;
import br.com.cod3r.strategy.worker.jobs.Pilot;
import br.com.cod3r.strategy.worker.jobs.Worker;
import br.com.cod3r.strategy.worker.strategies.eat.VeggieFoodStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.CarStrategy;
import br.com.cod3r.strategy.worker.strategies.work.DeveloperStrategy;

public class Client {

	public static void presentYourself(Worker worker, String name) {
		System.out.println("Hi, I'm " + name);
		worker.eat();
		worker.move();
		worker.work();
		System.out.println("----------------");
	}

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Worker jhon = new Developer();
		presentYourself(jhon, "Jhon");
		
		Worker ann = new Pilot();
		presentYourself(ann, "Ann");

		Worker carol = new HispsterDeveloper();
		presentYourself(carol, "carol");

		Person jhonPerson = new Person("Jhon", new VeggieFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhonPerson);
	}
}
