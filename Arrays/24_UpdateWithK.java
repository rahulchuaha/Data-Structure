import java.util.*;

public class UpdateWithK {
    public static void updateElement(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0 && arr[i] > k){
                arr[i] /= 2;
            } else if(arr[i]%2 == 1 && arr[i] > k){
                arr[i] += k;
            }
                
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
         updateElement(arr,k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
