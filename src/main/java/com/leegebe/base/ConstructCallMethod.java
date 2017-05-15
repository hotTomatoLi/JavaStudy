package com.leegebe.base;

/**
 * 父类构造函数调用子类覆盖的方法
 */
public class ConstructCallMethod {

    public static void main(String[] args){
        System.out.println(new B().getValue());
    }

    static class A{
        protected int value;
        public A(int i){
            setValue(i);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value ++;
                return  value;
            }finally {
                this.setValue(value);
                System.out.println(value);
            }
        }
    }

    static class B extends A{
        public B(){
            super(5);
            setValue(getValue() -3 );
        }

        public void setValue(int value){
            super.setValue(2 * value);
        }
    }

}
