package br.com.cod3r.builder.fluent.model;

public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getToy() {
        return gift;
    }

    public void setToy(String toy) {
        this.gift = toy;
    }

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side="
                + side + ", dessert=" + dessert + ", gift=" + gift + "]";
    }
}
