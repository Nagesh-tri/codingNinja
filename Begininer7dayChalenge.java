import java.util.* ;
import java.io.*; 

public class Begininer7dayChalenge {

    

    // 3. Largest Element in the Array
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int lg=arr[0];
        for(int i:arr){
            lg=Math.max(lg,i);
        }
        return lg;
    }
    
    // 4.  Sum Of Max And Min
    public static int sumOfMaxMin(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
          max=Math.max(arr[i],max);
          min=Math.min(arr[i],min);
        }
        return max+min;
    }

    // 5. Check Armstrong
    public static boolean checkArmstrong(int n) {
        // Write your code here
        // work. 1. find no of digs..d
        // 2. for each digit find i^d; (in log n)
        // 3. return sum of pows of digs == n
        int d= finddig(n);
        long sum=sumofDigs(n,d);
        return sum==n;
    }
    private static int finddig(int n){
        int d=0;
        while(n>0){
            d++;
            n /=10;
        }
        return d;
    }
    private static long sumofDigs(int n,int pow){
        // for each dig find n^pow and sumup them (first use n^pow inbuild)
        long sum=0;
        while(n>0){
            sum+=Math.pow(n%10,pow);
            n/=10;
        }
        return sum;
    }

    
}
