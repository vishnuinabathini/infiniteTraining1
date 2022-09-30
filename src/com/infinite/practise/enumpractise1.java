package com.infinite.practise;
    enum Color{
    RED("red"),
    GREEN,
    BLUE("blue");
    String name;
      private Color()    {
         System.out.println("constructor called for :"+ this.toString());
     }
    private Color(String name){
         this.name=name;
    System.out.println("constructor called for parameter:" +name);
}
    public void colorInfo(){
    System.out.println("universal color name: "+name);
}
        }

public class enumpractise1 {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println("c1.ordinal()=" + c1.ordinal());
        System.out.println(c1);
        c1.colorInfo();
        System.out.println(Color.valueOf("BLUE"));

        Color c2 = Color.RED;
        System.out.println("c2.ordinal()= " + c2.ordinal());
        c2.colorInfo();
        Color[] arr = Color.values();

        for (Color col : arr) {
            System.out.println(col + "at Index" + col.ordinal());
        }
    }
}




