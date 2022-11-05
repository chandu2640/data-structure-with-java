package substring_subSequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        List<String> arr =new ArrayList<>();
        arr=letterCombinations("");
        System.out.println(arr);
    }
        public static List<String> letterCombinations(String digits) {
            ArrayList<String> ans=new ArrayList<>();
            HashMap<Character, String> list=new HashMap<>();
            list.put('1',"");
            list.put('2',"abc");
            list.put('3',"def");
            list.put('4',"ghi");
            list.put('5',"jkl");
            list.put('6',"mno");
            list.put('7',"pqrs");
            list.put('8',"tuv");
            list.put('9',"wxyz");

            recursion("",digits,ans,list);
            System.out.println(ans.size());

            return ans;
        }

        static void recursion(String ans, String str, ArrayList<String> arr, HashMap<Character,String> list){
            if(str.isEmpty()){
                arr.add(ans);
                return;
            }
            String ss=list.get(str.charAt(0));

            for(int i=0; i<ss.length(); i++){
                char ch=ss.charAt(i);
                recursion(ans+ch,str.substring(1),arr,list);
            }
        }
    }

