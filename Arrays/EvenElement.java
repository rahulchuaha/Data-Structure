import java.util.*;

public class EvenElement {
    public static void printEven(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print(i+" ");
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
         printEven(arr);
    }
}
