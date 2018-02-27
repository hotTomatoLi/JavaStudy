package com.leegebe.design.pattern.creational_patterns.builder.fast_food;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br>
 *
 * @author li
 * @date 2018/2/27 上午10:58
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item :" + item.name());
            System.out.print(", Packing :" + item.packing().pack());
            System.out.println(", Price :" + item.price());
        }
    }
}
