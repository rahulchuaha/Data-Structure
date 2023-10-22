import java.util.*;
public class CountIndexes {
    public static int indexValue(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == i) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(indexValue(arr));
    }
}
