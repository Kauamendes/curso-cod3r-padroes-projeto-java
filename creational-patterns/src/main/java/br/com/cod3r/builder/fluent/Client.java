package br.com.cod3r.builder.fluent;

import br.com.cod3r.builder.fluent.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .andMain("CheeseBurguer")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackcombo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fugde Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackcombo);
    }
}
