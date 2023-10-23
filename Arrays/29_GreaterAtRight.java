import java.util.*;

public class GreaterAtRight {
     public static void greaterThanMe(int arr[]){
         int n = arr.length;
         for(int i=0; i<n; i++){
             int count = 0;
             for(int j=i+1; j<n; j++){
                 if(arr[i] < arr[j]) count++;
             }
             System.out.print(count+" ");
         }
     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        greaterThanMe(arr);
    }
}