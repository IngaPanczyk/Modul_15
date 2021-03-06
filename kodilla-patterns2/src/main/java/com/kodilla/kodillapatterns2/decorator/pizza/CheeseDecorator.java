package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseDecorator extends AbstractPizzaDecorator {

    protected CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getIngredients(){
        return super.getIngredients() + ", extra cheese";
    }
}
