package com.infinite.training;


interface Pet {
     String cuddle();// need not to mention public and abstract as they are default
    default public void eat(){
        // if we want to implement the method we need to use default/static/private access modifier
        System.out.println("from interface Pet");
    }
    static public void eat1(){ //static / private method cannot be overridden
        System.out.println("from static interface Pet");
    }
    void func(); //all methods are in interface are public and abstract by default
}

interface ABC{
    default public void eat(){
        System.out.println("from ABC");
    }

    default public void def(){
        System.out.println("from default ABC class");
    }
}


class Dog implements Pet, ABC {

    public String cuddle() {
        return "Purring sounds";
    }
    //eat method it is coming from both interface to remove diamond problem
    // we have to defined this method in this class
    public void eat() {
        System.out.println("Eating stereotypical bones");
    }
    public void func(){
        System.out.println("from func");
    }

    static public void eat1(){
        System.out.println("from static interface Dog class");
    }


    public static void main(String[] args) {
        Dog d = new Dog();
        Pet.eat1(); //static can not access with object, only with interface name we can access
        d.eat();
        d.def(); // this is default method coming only from ABC, so no need to define in dog class
        Dog.eat1();  // you can not override Static  methods
        PetAdoptionCenter obj = new PetAdoptionCenter();
        Pet pdog = new Dog();
        Pet pcat = new Cat();
//      Pet p = new Pet(); can not create object of interface
        obj.adoptPet(pdog); // dynamic binding
        obj.adoptPet(pcat); // dynamic binding
    }

}
class Cat implements Pet {

    public String cuddle() {
        System.out.println("hello pet");
        return "Yawning sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical fish");
    }

    @Override
    public void func() {
        System.out.println("from method");
    }
}

class PetAdoptionCenter {
    public static void adoptPet(Pet pet) {
        pet.eat();
        pet.cuddle();
        System.out.println(" pet cuddle is  : " +pet.cuddle());
        System.out.println("You have successfully adopted the pet.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        adoptPet(dog1);
        Cat cat1 = new Cat();
        adoptPet(cat1);
    }
}

public class InterfaceExample {
}
