package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class CornDecorator extends AbstractPizzaDecorator {

    protected CornDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", corn";
    }
}
