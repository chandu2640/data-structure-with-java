package recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="apppa";

        String ans=pallindrome(str);
        if(str.equals(ans)) System.out.println("Pallindrome");
        else System.out.println("Not Pallindrome");

    }

    private static String pallindrome(String str) {
        if(str.length()==1) return str.substring(0,str.length());
        return(str.charAt(str.length()-1)+pallindrome(str.substring(0,str.length()-1)));
    }
}
