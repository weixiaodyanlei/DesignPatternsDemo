package com.dawn.builder.builder.impl;

import com.dawn.builder.builder.MealBuilder;
import com.dawn.builder.pojo.Meal;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯果汁");
    }
}
