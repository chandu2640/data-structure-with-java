package oops.interfaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Music Started");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped");
    }
}
