import java.util.*;
public class ReapeatingAndMissing {
 
    static void printTwoElements(int[] arr, int n){
        int[] temp = new int[n];   
        int repeatingNumber = -1;
        int missingNumber = -1;
 
        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }
 
        System.out.println(repeatingNumber);
        System.out.println(missingNumber);
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printTwoElements(arr, n);
    }
}
 