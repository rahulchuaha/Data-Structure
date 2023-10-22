import java.util.*;
public class SumExceptItself {
    public static int[] sumExpectItSelf(int arr[]){
           int sum = 0;
        for(int i=0; i<arr.length; i++)
                 sum = sum+arr[i];
              
        
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            res[i] = sum - arr[i];
        return res;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = sumExpectItSelf(arr);
        for(int i=0; i<n; i++){
            System.out.println(res[i]);
        }
    }
}