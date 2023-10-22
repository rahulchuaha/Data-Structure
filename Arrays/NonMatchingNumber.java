import java.util.*;

public class NonMatchingNumber {
    public static int printArr(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return i;
            
            
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(printArr(arr1, arr2));
    }
}