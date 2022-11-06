package oops.interfaces;

public class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Car's ElectricEngine Started");
    }
    public void stop(){
        System.out.println("Car's ElectricEngine Stopped");
    }
    public void acc(){
        System.out.println("Car's ElectricEngine Accelerated");
    }
}
