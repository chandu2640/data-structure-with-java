package binarySearch;

import java.util.Scanner;

public class SaliniExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        String[] str2=str1.split(",");
        String newStr="";

        for(int i=0; i<str2[1].length();i++){
            char c=str2[1].charAt(i);
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) newStr+=c;
        }

        if(str1.indexOf(newStr)>=0) System.out.println(true);
        else System.out.println(false);
    }
}
