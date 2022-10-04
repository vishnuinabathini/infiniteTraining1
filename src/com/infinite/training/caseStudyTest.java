package com.infinite.training;

import java.util.Scanner;

public class caseStudyTest {

}
class ItemType{
    private String userName;
     private  double advanceDeposit;
     private double cateringCostPerDay;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public double getCateringCostPerDay() {
        return cateringCostPerDay;
    }
    public void setCateringCostPerDay(double cateringCostPerDay) {
        this.cateringCostPerDay = cateringCostPerDay;
    }
    public double getAdvanceDeposit() {
        return advanceDeposit;
    }
    public void setAdvanceDeposit(double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public void display(){
        System.out.println("Item Types are");

        System.out.println("Name : "+userName+"\n"+
                "Cost per day : "+cateringCostPerDay+ "\n"+
                "advanceDeposit : "+advanceDeposit);
    }

}

    class internationalFilmFestival{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = "";
        System.out.println("Enter the name of the user" );
        String username = sc.next();


    // double advanceDeposit= 0;
       // double advanceDeposit =sc.nextDouble();vi

        System.out.println(" Enter the advance amount ");

      double advanceDeposit = sc.nextDouble();
        System.out.printf("costing cost per day %.2f",advanceDeposit);
        double cateringCostPerDay = sc.nextDouble();
        System.out.printf("costing cost per day %.2f",cateringCostPerDay);
     //   double cateringCostPerDay = sc.nextDouble();

        ItemType itemtype= new ItemType();
        itemtype.setUserName(username);
        itemtype.setAdvanceDeposit(advanceDeposit);
        itemtype.setCateringCostPerDay(cateringCostPerDay);

    }

    }



