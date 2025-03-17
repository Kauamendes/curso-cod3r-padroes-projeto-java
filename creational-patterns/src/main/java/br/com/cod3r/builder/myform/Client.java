package br.com.cod3r.builder.myform;


import br.com.cod3r.builder.myform.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = FastFoodMeal.builder()
                .main("CheeseBurguer")
                .drink("Coke")
                .side("Fries")
                .build();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = FastFoodMeal.builder()
                .side("Fries")
                .build();
        System.out.println(justFries);

        FastFoodMeal heartAtackcombo = FastFoodMeal.builder()
                .main("Monster Burguer")
                .drink("Milk Shake")
                .side("Large Fries")
                .dessert("Fugde Cake")
                .gift("2 Kilograms")
                .build();
        System.out.println(heartAtackcombo);
    }
}
