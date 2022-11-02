package Extra;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
        int age=sc.nextInt();
            if(age<0){
                System.out.println("Bhai tu janma nahi");
            }

            else if(age>=0 && age<=12){
                System.out.println("Child");
            }
            else if(age>12 && age<=19){
                System.out.println("Teen");
            }
            else if(age>=20 && age<35){
                System.out.println("Young");
            }
            else if(age>=35 && age<100){
                System.out.println("Budhwa");
            }
            else if (age>100){
                System.out.println("Bhai tu mar gaya hai");
            }
            else{
                break;
            }
        }
    }
}
