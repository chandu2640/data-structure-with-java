package substring_subSequence;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceThrown {
    public static void main(String[] args) {
        int num=6;
        ArrayList<Integer> ans=comb(0,num);
        System.out.println(ans);
        System.out.println(ans.size());
    }

    private static ArrayList<Integer> comb(int ans,int num) {
        if(num==0){
            ArrayList <Integer> arr=new ArrayList<>();
            arr.add(ans);
            return arr;
        }
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=1; i<=num; i++){
            arr.addAll(comb(ans*10+i,num-i));
        }
        return arr;
    }


}
