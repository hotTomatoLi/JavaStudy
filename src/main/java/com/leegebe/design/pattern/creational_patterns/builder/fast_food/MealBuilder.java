package com.leegebe.design.pattern.creational_patterns.builder.fast_food;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 上午11:01
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal  = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
