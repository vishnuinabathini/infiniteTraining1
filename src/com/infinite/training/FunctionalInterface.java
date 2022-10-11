package com.infinite.training;

interface Calculator{
    int sum(int a, int b);
    default  void sub(int a, int b){
        System.out.println(a-b);
    }
    default  void sub1(int a, int b){
        System.out.println(a-b);
    }
}
public class FunctionalInterface implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        FunctionalInterface obj = new FunctionalInterface();
        System.out.println(obj.sum(2,4));
        Calculator calc = new FunctionalInterface();
        System.out.println(calc.sum(2,4));
        Calculator c = new Calculator() {
            @Override
            public int sum(int a, int b) {
                System.out.println("from anonymous class");
                return a+b;
            }
        };
        System.out.println(c.sum(4,5));
        c.sub(8,4);
        Calculator c1 = ( a,  b)-> {
            System.out.println("from lambda  class");
            return a+b;
        };
        System.out.println(c1.sum(4,5));
    }
}
