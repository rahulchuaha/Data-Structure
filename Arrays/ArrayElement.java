import java.util.*;

public class ArrayElement {
    public static void noteDivisiblebyFour(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(i%4 != 0){
              System.out.print(arr[i]+" ");  
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
        noteDivisiblebyFour(arr);
    }
}