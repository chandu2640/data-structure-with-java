package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son=new Son("Chandan",25);

        Daughter daughter=new Daughter("Salma",22);

        GrandSon grandSon=new GrandSon("Raj",15,"Vinayak");

        son.dispName();
        son.dispAge();

        daughter.dispName();
        daughter.dispAge();

        grandSon.dispName();
        grandSon.dispAge();

    }
}
