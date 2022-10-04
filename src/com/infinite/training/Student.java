package com.infinite.training;
import java.io.EOFException;
import java.io.IOException;
class Student {
    final float PI=3.14f;
    //public void display() throws RuntimeException {
      public void display(){

        System.out.println("Student");
    }
    void disp(){
        System.out.println("from disp from the parent class i.e.,student");
    }
}

class UndergraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
        public void display(){
            //public void display() throws RuntimeException {

            System.out.println("This Student is Undergraduate");
    }


}
class GraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
    public void display() {
        System.out.println("This Student is Graduate");
    }
    void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {

        Student student = new Student();
        student.display();
        Student obj1 = new GraduateStudent();
        GraduateStudent obj3 = new GraduateStudent();
//        GraduateStudent obj = new Student(); -- compile time error
        obj1.display();
        obj3.show();
        obj1.disp();
        obj3.disp();
//        obj1.show();
        Student obj2 = new UndergraduateStudent();
        obj2.display();
    }
}
