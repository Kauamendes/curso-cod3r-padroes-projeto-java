package br.com.cod3r.decorator.coffeeShop;

import br.com.cod3r.decorator.coffeeShop.model.Drink;
import br.com.cod3r.decorator.coffeeShop.model.Expresso;
import br.com.cod3r.decorator.coffeeShop.model.Tea;
import br.com.cod3r.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.cod3r.decorator.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));

		order("English Tea", new DoubleDrink(new Milk(new Tea())));
		//Formas diferentes de usar a composição e que podem formar objetos diferentes com a flexibilidade do decorator
		order("English Tea", new Milk(new DoubleDrink(new Tea())));
		//podemos até criar um drink quadruplo
		order("English Tea", new DoubleDrink(new DoubleDrink(new Tea())));
	}
}
