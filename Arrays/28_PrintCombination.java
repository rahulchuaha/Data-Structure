import java.util.*;

public class PrintCombination {
    public static void PrintComination(int arr[], int k){
        for(int l=0; l<arr.length; l++){
            for(int r=l; r<arr.length; r++){
                if(  arr[l]+arr[r] == k)
                    System.out.println(arr[l]+" "+arr[r]);
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
        int k = sc.nextInt();
        PrintComination(arr,k);
    }
}