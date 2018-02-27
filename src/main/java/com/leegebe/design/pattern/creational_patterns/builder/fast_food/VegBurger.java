package com.leegebe.design.pattern.creational_patterns.builder.fast_food;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 上午10:53
 */
public class VegBurger extends Burger {


    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25.0f;
    }
}
