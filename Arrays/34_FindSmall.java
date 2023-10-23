import java.util.*;

public class FindSmall {
    public static void smallestElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j]<arr[i])
                    count++;
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
        smallestElement(arr);
    }
}