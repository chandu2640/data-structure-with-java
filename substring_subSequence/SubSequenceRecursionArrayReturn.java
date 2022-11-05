package substring_subSequence;

import java.util.ArrayList;

public class SubSequenceRecursionArrayReturn {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=new ArrayList<>();

        System.out.println(ans);
        ans= subSequenceReturn("",str);
        System.out.println(ans);

    }

    private static void subSequence(String ans, String str, ArrayList<String> arr) {
        if(str.isEmpty()){
            arr.add(ans);
            return;
        }
        char ch=str.charAt(0);
        subSequence(ans+ch,str.substring(1),arr);
        subSequence(ans,str.substring(1),arr);
    }


    private static ArrayList<String> subSequence(String ans, String str) {
        ArrayList<String> arr=new ArrayList<>();
        if(str.isEmpty()){
            arr.add(ans);
            return arr;
        }
        char ch=str.charAt(0);
        arr.addAll(subSequence(ans+ch,str.substring(1)));
        arr.addAll(subSequence(ans,str.substring(1)));
        System.out.println(arr);

        return arr;
    }


    //Another way to return an ArrayList
    private static ArrayList<String> subSequenceReturn(String ans, String str) {
        if(str.isEmpty()){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(ans);
            return arr;
        }
        char ch=str.charAt(0);
        ArrayList<String> left = subSequenceReturn(ans+ch,str.substring(1));
        ArrayList<String> right = subSequenceReturn(ans,str.substring(1));

        left.addAll(right);

        return left;
    }
}

