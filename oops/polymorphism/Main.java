package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square sqare=new Square();

        shape.area();
        circle.area();
        sqare.area();
    }
}
