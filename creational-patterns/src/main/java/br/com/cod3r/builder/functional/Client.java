package br.com.cod3r.builder.functional;


import br.com.cod3r.builder.functional.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .andMain("CheeseBurguer")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackcombo = new FastFoodMeal.Builder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fugde Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackcombo);
    }
}
