package br.com.cod3r.builder.fluent.builder;

import br.com.cod3r.builder.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

    //Obrigatorio
    private final String side;

    //Opcionais
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder forDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
