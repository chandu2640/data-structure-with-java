package oops.abstraction;

public class Daughter extends Father{

    Daughter(String name, int age){
        super(name, age);
    }

    @Override
    void dispName() {
        System.out.println("I am daughter and my name is "+this.name);
    }

    @Override
    void dispAge() {
        System.out.println("I am youth and my age is "+this.age);
    }
}
