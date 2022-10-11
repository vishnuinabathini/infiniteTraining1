package com.infinite.training;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
}
 class ArraysLengthTester<T1,T2> { //T1,T2 are two data types


    //method takes two array type parameters of type T1,T2
    public String lengthTester(T1[] arr1,T2[] arr2) {
        return (arr1.length==arr2.length?"Equal":"Not Equal");
    }
    public static void main(String[] args) {
        String[] sarr = {"A","B","C"};
        Integer[] numarr1 = {1,2,3,4};
        Integer[] numarr2 = {4,5,6,7};

        ArraysLengthTester<String,Integer> tester1 = new
                ArraysLengthTester<String,Integer>();
        System.out.println(tester1.lengthTester(sarr, numarr1));

        ArraysLengthTester<Integer,Integer> tester2 = new
                ArraysLengthTester<Integer,Integer>();
        System.out.println(tester2.lengthTester(numarr1, numarr2));

    }

}
class ArrayListExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();  // Creating an ArrayList object

        // Adding the element to the list
        numbers.add(1);

        numbers.add(2);
        numbers.add(3);
      //  numbers.add(3);
        numbers.add(123);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //numbers.remove(2);
        System.out.println("My number list: " + numbers);
        // Finding the size of the ArrayList
        System.out.println("The array size: " + numbers.size());
        // Adding the number 15 at a particular index (index: 2) in the ArrayList
        numbers.add(2, 15);
        System.out.println("Observe the second index: " + numbers);

        // Finding the size of the ArrayList
        System.out.println("The array size: " + numbers.size());

        // Retrieving the element at a specified index
        System.out.println("The number present at the fifth index is: " + numbers.get(5));

        // Modifying the element at a specified index
        numbers.set(2, 200);
        System.out.println("The number at the 2nd index is changed from 2 to 200: " + numbers);

    }
}