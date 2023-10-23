import java.util.*;

public class RainTrapping {
    public static int max(int arr[], int l, int r){
        int max = 0;
        for(int j=l; j<=r; j++){
            if(arr[j]>max)
                max = arr[j];
        }
        return max;
    }
    public static int trapRainWater(int arr[]){
        int water = 0;
        for(int i=0; i<arr.length; i++){
            int leftmax = max(arr,0,i);
            int rightmax = max(arr,i,arr.length-1);
            water += Math.min(leftmax,rightmax)-arr[i];
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int water = trapRainWater(arr);
        System.out.println(water);
    }
}