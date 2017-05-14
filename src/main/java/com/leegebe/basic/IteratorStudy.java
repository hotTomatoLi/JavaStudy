package com.leegebe.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器
 */
public class IteratorStudy {

    public void testIterator(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        listData(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer data = iterator.next();
            if(data == 1 || data == 3){
                iterator.remove();
            }
        }
        listData(list);

    }

    public void listData(List<Integer> data){
        for(int i = 0; i < data.size(); i++){
            System.out.print(data.get(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        IteratorStudy iteratorStudy = new IteratorStudy();
        iteratorStudy.testIterator();
    }

}
