package com.infinite.training;

public class ExceptionScenario1 {

  static class MobileShopee {
        static int stockAvailable = 400;

        public static void checkStock(int quantityRequired) throws Exception {
            if (stockAvailable < quantityRequired)
                throw new Exception("There is not enough stock available.");
            System.out.println("Please proceed to the check-out");
        }

        public static void buyMobiles(int quantityRequired) {
            try {
                checkStock(550);
                System.out.println("Thank you for shopping at MobileShopee");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }

        public static void main(String[] args) {
            buyMobiles(550);
        }
    }
}