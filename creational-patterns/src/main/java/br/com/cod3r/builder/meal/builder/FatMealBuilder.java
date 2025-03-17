package br.com.cod3r.builder.meal.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Milk Shake");
    }

    @Override
    public void buildMain() {
        meal.setMain("Triple Cheddar Bacon Burguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large IceCream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Hospital pass");
    }
}
