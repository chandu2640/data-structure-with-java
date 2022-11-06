package oops.abstraction;

public class Son extends Father{
    Son(String name, int age){
        super(name,age);
    }
    @Override
    void dispAge() {
        System.out.println("My age is "+this.age);
    }

    @Override
    void dispName() {
        System.out.println("My name is "+this.name);
    }
}
