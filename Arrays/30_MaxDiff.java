import java.util.*;

public class MaxDiff {
    public static int maxDiff(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int l=0; l<arr.length; l++){
            for(int r=l+1; r<arr.length; r++){
                if(arr[r] - arr[l] > max)
                    max = arr[r] - arr[l];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        int max = maxDiff(arr);
        System.out.println(max);
    }
}
