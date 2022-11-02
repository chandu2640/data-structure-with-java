package Extra;

public class Rajan {
    public static void main(String[] args) {
        String str="Abbbaaa";
        String ans="";
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                if(count<=2){
                    ans=ans+str.charAt(i);
                }
            }
            else if(count<3){
                ans=ans+str.charAt(i);
                count=0;
            }
        }
        System.out.println(ans);
    }


}
