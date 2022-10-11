package com.infinite.training;

public class Address {
    private String doorNo;
    private String street;

    public Address(String doorNo, String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //Uncomment the code given below
    @Override
    public String toString() {
		return "Address\nDoor No: "+doorNo+"\nStreet: "+street;
	}
}
class Tester1 {

    public static void main(String[] args) {
        Address addressOne = new Address("11","Oxford Street");
        System.out.println();
        System.out.println("Address details of addressOne" +addressOne);
       // System.out.println(addressOne);
       Address addressTwo = new Address("11","Oxford Street") ;
        System.out.println();
        System.out.println("Address details for the addressTwo  is " + addressTwo);

        Address addressThree = new Address("123","electronic city");
        System.out.println();
        System.out.println("Address details of addressThree " + addressThree);


        if(addressOne==addressTwo)
        {
            System.out.println("The Address objects are same");
        }
        else{
            System.out.println("The Address objects are not same");
        }

        addressOne=addressTwo;


        if(addressOne.equals(addressTwo)){
            System.out.println("the address objects are same");
            //return true;

        }
        else{
            System.out.println("The address objects are not same ");
        }


    }
}

