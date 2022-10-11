package com.infinite.training;

public abstract class Automobile {
    private String vehicleNo;
    public abstract void start();
    public abstract void stop();
    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

public static class Car extends Automobile {
    public void start() {
        System.out.println("Car " + getVehicleNo() + " has started");
    }
    public void stop() {
        System.out.println("Car " + getVehicleNo() + " has stopped");
    }
}
public static class Bike extends Automobile {
    public void start() {
        System.out.println("Bike " + getVehicleNo() + " has started");
    }
    public void stop() {
        System.out.println("Bike " + getVehicleNo() + " has stopped");
    }
}
    public static class AbstractTester {
        public static void main(String[] args) {
            Automobile skyline = new Car();

            skyline.setVehicleNo("WB-4546-34");
            Automobile ninja = new Bike();
            ninja.setVehicleNo("KA-8675-72");
            startAutomobile(skyline);
            System.out.println("skyline = " +skyline);
            startAutomobile(ninja);
            System.out.println("ninja = " + ninja);
            stopAutomobile(skyline);
            System.out.println("skyline = " + skyline);
            stopAutomobile(ninja);
            System.out.println("ninja = " + ninja);
        }

        public static void startAutomobile(Automobile automobile) {
            automobile.start();
        }
        public static void stopAutomobile(Automobile automobile){
            automobile.stop();
        }


    }

}
