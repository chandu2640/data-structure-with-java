package recursion;

public class StrProblem {
    public static void main(String[] args) {
//        String str="babbcdaf";
        String str="bananaappleorangeguava";
        String ans="";
//        System.out.println(remove(str));
        System.out.println(skipWord(str,"orange"));
    }

    private static String remove(String str) {
        if(str.length()==0) return "";
        if(str.charAt(0)=='a'){
            return remove(str.substring(1));
        }
        return str.charAt(0)+remove(str.substring(1));
    }
    private static String skipWord(String str, String word) {
        if(str.length()==0) return "";
        if(str.startsWith(word)){
            return skipWord(str.substring(word.length()),word);
        }
        else return str.charAt(0) + skipWord(str.substring(1),word);
    }
}
