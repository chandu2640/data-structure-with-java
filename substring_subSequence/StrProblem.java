package substring_subSequence;

public class StrProblem {
    public static void main(String[] args) {
        String str="alphxxdida";
        int ans=unaffectedChar(str);
        System.out.println(ans);
    }

    public static int unaffectedChar(String dataStream){
        int answer=0;
        String revString=reverse(dataStream);
        for (int i = 0; i < dataStream.length(); i++) {
            if(dataStream.charAt(i)==revString.charAt(i)) answer++;
        }
        return answer;
    }

    static String reverse(String str) {
        if(str.length()==0) return "";
        return reverse(str.substring(1))+str.charAt(0);
    }


}
