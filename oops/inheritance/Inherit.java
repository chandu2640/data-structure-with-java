package oops.inheritance;

class Father{
    int averageAge;
    String familyName;

    Father(int avg, String name){
        this.averageAge=avg;
        this.familyName=name;
    }
    void pri(){
        System.out.println("Hello from parent");
    }
}

class Son extends Father{
    int age;

    Son(int avg, String name,int age) {
        super(avg, name);
        this.age=age;
    }

}

class GrandSon extends Son{

    String gf;

    GrandSon(int avg, String name, int age, String gf) {
        super(avg, name, age);
        this.gf=gf;
    }
    void pri(){
        System.out.println("Hello from GrandSon Class");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Father chandan=new Father(25,"Thakur");
        Son shakti=new Son(21,"Yadav",11);
        GrandSon raman=new GrandSon(41,"Sah",23,"Sweta");

        System.out.println(chandan.averageAge);
        System.out.println(chandan.familyName);

        System.out.println(shakti.averageAge);
        System.out.println(shakti.familyName);
        System.out.println(shakti.age);

        System.out.println(raman.averageAge);
        System.out.println(raman.familyName);
        System.out.println(raman.age);
        System.out.println(raman.gf);

        shakti.pri();
        raman.pri();
    }
}
