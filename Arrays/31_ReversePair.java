import java.util.*;

public class 31_ReversePair {
    public static void printAllPair(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr.length-1; j>=0; j--){
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
        printAllPair(arr);
    }
}