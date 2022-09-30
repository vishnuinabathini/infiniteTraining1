package com.infinite.training;


import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class ForLoopExample2 {

}
class Account {

    String name;
    long accountNumber;

    void setData(String custName, int accNum) {
        this.name = custName;
        this.accountNumber = accNum;
    }

    void display() {
        System.out.println("Name :- " + name);
        System.out.println("Account Number :- " + accountNumber);
    }


    void ArrayObject() {
        System.out.println("inside function");
        Account accArray[] = new Account[3];
        accArray[0] = new Account();
        accArray[0].setData("Ella", 345234);
        accArray[1] = new Account();
        accArray[1].setData("Scarlet", 345278);
        accArray[2] = new Account();
        accArray[2].setData("Harper", 345897);
        System.out.println("Account holder's information");
        System.out.println();
        for (Account account : accArray) {
            account.display();
            System.out.println();
        }


    }
    static void ArraysFunction() {
        int[] numArr = {6, 8, 9, 10, 40, 66};
        int resultIndex = Arrays.binarySearch(numArr, 50);
        System.out.println("resultIndex = " + resultIndex);
        int[] numArr1 = {6, 8, 9, 10, 40, 66};
        int[] numArr2 = {6, 8, 9, 10, 40, 66};
        boolean resultCompare = Arrays.equals(numArr1, numArr2);
        System.out.println(resultCompare); //prints true or false
        int[] numArr3 = {20, 5, 30, 50, 10, 8};
        Arrays.sort(numArr3);
        for (int a : numArr3) {
            System.out.print(a + " ");
        }



    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.ArrayObject();

    }
}


