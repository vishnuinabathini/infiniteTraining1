package com.infinite.training;

public class StudentDetails {

    private String name;
    private int rollNumber;
   StudentDetails() {
        name = "N.A";
        rollNumber = -1;
    }
    StudentDetails(String userName, int rollNo) {
        name = userName;
        rollNumber = rollNo;
    }
    StudentDetails(String studentName) {
        this();
        name = studentName;
    }
     StudentDetails(int rollNo) {
        this();
        rollNumber = rollNo;
    }
    public void displayStudentDetails() {
        System.out.println("Student Details are:");
        System.out.println("name = " + name);
        System.out.println("rollNumber = " + rollNumber);
    }
    public static void main(String[] args) {
        StudentDetails student1=new StudentDetails();
        student1.displayStudentDetails();
        System.out.println();

        StudentDetails student2 = new StudentDetails("vishnu",1030089);
        student2.displayStudentDetails();
        System.out.println("student2 = " + student2);
        
        StudentDetails student3= new StudentDetails("triveni");
         student3.displayStudentDetails();
        System.out.println();

        StudentDetails student4 = new StudentDetails(99);
        student4.displayStudentDetails();
        System.out.println();
    }
}

