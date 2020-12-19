package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void basicPizzaOrderGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        //When
        BigDecimal calculateCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculateCost);

    }
    @Test
    public void basicPizzaOrderGetIngredients(){
        //Given
        Pizza pizza = new BasicPizza();
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("Ingredient: pizza dough, tomato sauce, cheese ",ingredients);

    }
    @Test
    public void pizzaOrderWithCheeseCornHawaiianGetCost(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CornDecorator(pizza);
        pizza = new HawaiianPizzaDecorator(pizza);

        //When
        BigDecimal calculateCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(35),calculateCost);

    }
    @Test
    public void pizzaOrderWithCheeseCornHawaiianGetIngredients(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CornDecorator(pizza);
        pizza = new HawaiianPizzaDecorator(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("Ingredient: pizza dough, tomato sauce, cheese, extra cheese, corn, ham, pineapple",ingredients);

    }
}
