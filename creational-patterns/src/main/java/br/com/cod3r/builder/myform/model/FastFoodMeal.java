package br.com.cod3r.builder.myform.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;
}
