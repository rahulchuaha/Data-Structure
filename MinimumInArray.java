import java.util.*;
public class MinimumInArray {
    public static int getmin(int arr[]){
        int res = arr[0];
        for(int i=0; i<arr.length; i++){
            res = Math.min(res,arr[i]);
                 
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        System.out.println(getmin(arr));
    }
}