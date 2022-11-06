package oops.interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player=new CDPlayer();


    Engine abc=new ElectricEngine();
    Engine def=new PowerEngine();



    public NiceCar(){
        engine = new ElectricEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
