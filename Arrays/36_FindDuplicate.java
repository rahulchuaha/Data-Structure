import java.util.*;

public class FindDuplicate {
    public static boolean printDulicate(int arr[]){
        for(int l=0; l<arr.length;l++){
            int count = 0;
            for(int r=0; r<arr.length; r++){
                if(arr[l] == arr[r])  count++;
            }
            if(count > 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(printDulicate(arr));
    }
}
