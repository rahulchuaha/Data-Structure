import java.util.*;

public class GreaterThanMe {
    public static void greaterThanMe(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]) count++;
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