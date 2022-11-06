package oops.inheritance;

class Student{
    int roll;
    String name;
    char grade;

    Student(int roll, String name, char grade){
        this.roll=roll;
        this.name=name;
        this.grade=grade;
    }
    Student(){
        this(990,"Mahatma",'B');

    }
    void greeting(){
        System.out.println("My name is "+this.name);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student chandan=new Student(14,"Chandan ",'A');
//        chandan.name="Chandan";
//        chandan.roll=5;
//        chandan.grade='A';

        Student aadarsh=chandan;

        System.out.println(chandan.roll);
        System.out.println(chandan.name);
        System.out.println(chandan.grade);
        System.out.println(aadarsh.roll);
        System.out.println(aadarsh.name);
        System.out.println(aadarsh.grade);

        chandan.greeting();
        aadarsh.greeting();
    }
}
