package com.leegebe.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器 演示
 * 如果需要在遍历的时候删除一个List中的元素，需要利用迭代器进行删除
 * 如果在for中直接调用list.remove()，则会产生数据问题，可能与抛出运行时异常（数组越界）
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
//        IteratorStudy iteratorStudy = new IteratorStudy();
//        iteratorStudy.testIterator();
//
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");
        stringList.add("4");
        stringList.add("4");
        stringList.add("3");

        for(int i = 0 ; i < stringList.size(); i++){
            if(stringList.get(i).equals("4")){

            }
            System.out.println(i);
            System.out.println(stringList.size());
        }
    }

}
