package oops.abstraction;

public abstract class Father {
    String name;
    int age;

    Father(String name,int age){
        this.name=name;
        this.age=age;
    }

    abstract void dispName();
    abstract void dispAge();
}
