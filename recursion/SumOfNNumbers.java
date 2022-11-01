package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int sum=sumOfNumbers(5);
        System.out.println(sum);
    }

    private static int sumOfNumbers(int num) {
        if(num>0){
            return num+sumOfNumbers(num-1);
        }
        return 0;
    }
}
