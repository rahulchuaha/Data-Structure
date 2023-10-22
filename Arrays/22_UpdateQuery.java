import java.util.*;

public class UpdateQuery{
    public static void update(int arr[], int left, int right, int x){
        for(int i=left; i<=right; i++){
            arr[i] = x;
        }
    }

    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        int x = sc.nextInt();
        update(arr, left, right, x);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}