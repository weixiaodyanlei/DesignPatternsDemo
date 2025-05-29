package com.dawn.builder.builder;

import com.dawn.builder.pojo.Meal;

public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
