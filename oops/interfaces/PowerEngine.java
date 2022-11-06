package oops.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Car's PowerEngine Started");
    }

    @Override
    public void stop() {
        System.out.println("Car's PowerEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Car's PowerEngine Accelerated");
    }
}
