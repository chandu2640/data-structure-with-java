package substring_subSequence;

public class SubSequenceRecursion {
    public static void main(String[] args) {
        String str="abc";
        subSequence("",str);
    }

    private static void subSequence(String ans, String str) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        subSequence(ans+ch,str.substring(1));
        subSequence(ans,str.substring(1));
    }
}
