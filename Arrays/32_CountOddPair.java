import java.util.*;

public class CountOddPair {
    public static void prindOddPair(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if((arr[i]+arr[j])%2 == 1)
                    System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        prindOddPair(arr);
    }
}