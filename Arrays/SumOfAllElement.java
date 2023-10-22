import java.util.*;

public class SumOfAllElement {
    public static int sum(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(sum(arr));
    }
}
