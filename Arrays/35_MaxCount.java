import java.util.*;

public class 35_MaxCount {
    public static int countMax(int arr[]){
      int maxfrq = 0, value = 0;
        for(int l=0; l<arr.length; l++){
            int count = 0;
            for(int r=0; r<arr.length; r++){
                if(arr[r] == arr[l]) count++;
            }
            if(count>maxfrq){
            value = arr[l];
                maxfrq = count;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(countMax(arr));
    }
}