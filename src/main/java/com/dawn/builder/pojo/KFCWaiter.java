package com.dawn.builder.pojo;

import com.dawn.builder.builder.MealBuilder;

public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal construct() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
