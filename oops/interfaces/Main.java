package oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car();
//        System.out.println(car.price);
//        car.start();
//        car.acc();
//        car.stop();
//
//        MediaPlayer mediaCar=new Car();
//        mediaCar.start();
//        car.brake();


        NiceCar car=new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
