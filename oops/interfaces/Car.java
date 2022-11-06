package oops.interfaces;

public class Car implements Engine,Brake, MediaPlayer{

    @Override
    public void brake() {
        System.out.println("The car is braking");
    }

    @Override
    public void start() {
        System.out.println("The Car is Starting");
    }

    @Override
    public void stop() {
        System.out.println("The car is Stopping");
    }

    @Override
    public void acc() {
        System.out.println("The car is Accelerating");
    }
}
