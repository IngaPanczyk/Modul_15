package com.kodilla.kodillapatterns2.decorator.pizza;

import com.kodilla.kodillapatterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements Pizza {
    private final Pizza pizza;

    protected AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
