package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizzaDecorator extends AbstractPizzaDecorator {

    protected HawaiianPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", ham, pineapple";
    }
}
