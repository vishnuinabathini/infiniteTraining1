package com.infinite.training;

public class ExceptionScenario3 {

  static  class MobileShopee{
        static int stockAvailable = 400;
        public static void checkStock(int quantityRequired) throws Exception{
            if(stockAvailable < quantityRequired)
                throw new Exception("There is not enough stock available.");
            System.out.println("Please proceed to the check-out");
        }
        public static void buyMobiles(int quantityRequired) throws Exception{
            checkStock(401);
            System.out.println("Please pay for the items in your cart.");
        }
        public static void main(String[] args) throws Exception{
            buyMobiles(401);
        }
    }
}
