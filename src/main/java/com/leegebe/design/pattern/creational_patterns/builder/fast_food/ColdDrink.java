package com.leegebe.design.pattern.creational_patterns.builder.fast_food;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 上午10:52
 */
public abstract class ColdDrink implements Item {

    public abstract float price();

    public Packing packing() {
        return new Bottle();
    }
}
