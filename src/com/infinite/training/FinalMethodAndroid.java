package com.infinite.training;

public class FinalMethodAndroid {
    void ringtone()// final void ringtone()
    {
    System.out.println("Mobile phone is ringing.");
}
}
class Samsung extends FinalMethodAndroid{

   void ringtone() {
        System.out.println("Samsung is ringing.");
    }
}

class TesterAndroid {
    public static void main(String[] args) {
        //creating the object of Android
        FinalMethodAndroid obj1 = new FinalMethodAndroid();
        obj1.ringtone(); //It will invoke the method in the parent class


        Samsung obj2 = new Samsung();
        obj2.ringtone(); //Cannot invoke ringtone() from child class as the
        //parent class has marked it final.
    }
}


