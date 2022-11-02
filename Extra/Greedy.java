package Extra;

public class Greedy {
    public static void main(String[] args) {
        int[] arr={1, 4, 1, 3, 2, 6, 7};
        int ans=minJumps(arr);
        System.out.println(ans);
    }

    private static int minJumps(int[] arr) {
        int count=0;

        int curr=0;
        int far=0;
        for(int i=0; i<arr.length-1; i++){

            far=Math.max(far,arr[i]+i);
            if(i==curr){
                count++;
                curr=far;
            }
        }
        if(curr>=(arr.length-1))return count;

        else return -1;
    }
}
