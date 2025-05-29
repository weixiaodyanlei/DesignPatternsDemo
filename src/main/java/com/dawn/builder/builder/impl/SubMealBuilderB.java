package com.dawn.builder.builder.impl;

import com.dawn.builder.builder.MealBuilder;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
