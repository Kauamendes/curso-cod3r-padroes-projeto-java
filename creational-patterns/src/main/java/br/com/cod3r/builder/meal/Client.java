package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.*;
import br.com.cod3r.builder.meal.director.MealDirector;

public class Client {

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.contructCombo();
		System.out.println(director.getCombo());
		System.out.println("--------------------------------\n");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}