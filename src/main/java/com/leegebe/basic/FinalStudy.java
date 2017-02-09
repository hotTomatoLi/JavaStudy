package com.leegebe.basic;

/**
 * Final使用
 */
public class FinalStudy {

    private final int a ;

    static String SA = "123";

    static final String SB = "12";

    static String SC = SB + "3";

    static String SE = "12";

    static String SF = SE + "3";

    public FinalStudy(){
        a = 0;
    }

    public FinalStudy(int a){
        this.a = a;
    }
    public static void main(String[] args){
        String a = "123";
        final String b = "12";
        String c = b + "3";
        System.out.println(a == c);
        String e = "12";
        String f = e + "3";
        String g = e + "3";
        System.out.println(a == f);
        System.out.println(g == f);
        System.out.println(SC == SA);
        System.out.println(SF == SA);
    }




    public final void test(final int a){

    }

    public void test(){

    }
}
