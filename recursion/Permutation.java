package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        String str="abcd";

        ArrayList<String> ans=permutationArr("",str);
        Collections.sort(ans, Collections.reverseOrder());

        System.out.println(ans);
        System.out.println(permutationCount("",str));
    }

    private static void permutation(String ans, String str) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            permutation(first + ch + second, str.substring(1));
        }
    }

    private static ArrayList<String> permutationArr(String ans, String str) {
        if(str.isEmpty()){
            ArrayList<String> mainList=new ArrayList<>();
            mainList.add(ans);
            return mainList;
        }
        ArrayList<String> arr=new ArrayList<>();
        char ch=str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            arr.addAll(permutationArr(first + ch + second, str.substring(1)));
        }
        return arr;
    }

    private static int permutationCount(String ans, String str) {
        if(str.isEmpty()){
            return 1;
        }

        char ch=str.charAt(0);
        int count=0;
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            count+=permutationCount(first + ch + second, str.substring(1));
        }
        return count;
    }


}
