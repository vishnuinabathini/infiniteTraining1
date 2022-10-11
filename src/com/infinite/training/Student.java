package com.infinite.training;
class Student {
    final float PI=3.14f;
     void display() throws RuntimeException {

        System.out.println("Student");
    }
    void disp(){
        System.out.println("from disp");
    }
}
class UndergraduateStudent extends Student{
    //This method overrides display() of parent Student
    @Override
    public void display() throws RuntimeException {
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
        Student obj1 = new Student();
        Student obj3 = new Student();
//        GraduateStudent obj = new Student(); -- compile time error
        obj1.display();
      //  obj3.show();
        obj1.disp();
//        obj1.show();
        Student obj2 = new UndergraduateStudent();
        obj2.display();
    }
}
