package com.infinite.training;

public class MethodOverloadingMathExample {
    public float calculateArea(float radius) {
        return 3.14f * radius * radius;
    }

    // Method to find the area of rectangle
    public float calculateArea(float length, float breadth) {
        return length * breadth;
    }
    /*//Method to find the area of the triangle
    public float calculateArea(float base,float height){
       return (float) (0.5*base*height);
    }*/
}
    class Tester{
        public static void main(String[] args) {

            MethodOverloadingMathExample methodOverloadingMathExample= new MethodOverloadingMathExample();
            float circleArea=methodOverloadingMathExample.calculateArea(1.7f);
            System.out.println("circleArea = " + circleArea);
            float rectangleArea=methodOverloadingMathExample.calculateArea(2.5f, 2.5F);
            System.out.println("rectangleArea = " + rectangleArea);

        }
    }

