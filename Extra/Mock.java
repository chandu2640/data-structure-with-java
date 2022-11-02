package Extra;

//ranjan
//rna 1,3,5
//ajn 2,4,6

//anr == nja

//strOdd, strEven
//strOddRev, strEvenRev

//one for loop 1 to str.length end
//another for loop from 0 to strOdd.length
//if(strOddRev).equals(strEvenRev)

public class Mock {
    public static void main(String[] args) {
        String str="aaggmm";
        //odd- agm -mga
        //even - agm - mga
        //String strEven="", strOdd="";
        for (int i = 0; i < str.length(); i=i+2) {
            if(str.charAt(i) != str.charAt(i+1)){
                System.out.println("Bad String");
                return;
            }
        }
        System.out.println("Good String");

//        System.out.println(strEven);
//        System.out.println(strOdd);
//        if(strEven.equals(strOdd)) System.out.println("Good String");
//        else System.out.println("Bad String");
    }
}
