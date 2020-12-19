package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15.00);
    }
    @Override
    public String getIngredients(){
        return "Ingredient: pizza dough, tomato sauce, cheese";
    }
}
