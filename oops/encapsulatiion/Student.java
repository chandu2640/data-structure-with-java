package oops.encapsulatiion;

public class Student {
    private String name;
    private int age;
    private int id;

    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getId(){
        return this.id;
    }

    public void allDetails(){
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getAge());
    }
}
