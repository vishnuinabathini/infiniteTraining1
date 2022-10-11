package com.infinite.training;

    class TesterFinalClass{
        public static void main(String[] args) {
            FinalClsEmploye e=new FinalClsEmploye();
            PermanentEmployee pe=new PermanentEmployee();
        }
    }

   public  class FinalClsEmploye{ ///public final class FinalClsEmploye
       FinalClsEmploye() {
            System.out.println("Inside Final Parent Constructor");
        }
    }

    class PermanentEmployee extends FinalClsEmploye{  //creating child class for final parent class
        PermanentEmployee() {
            System.out.println("Inside child of Final Parent constructor.");
        }
    }
// This class will throw compilation error saying "PermanentEmployee cannot subclass the final class Employee"

