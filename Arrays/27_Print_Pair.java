import java.util.*;

public class Print_Pair {
    public static void printPair(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
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
        printPair(arr);
    }
}