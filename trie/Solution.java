package trie;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int c=0;

        while(c<first.length()){
            if(first.charAt(c)==last.charAt(c)) c++;
            else break;
        }
        return c==0?"": first.substring(0,c);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }

}
