import java.util.*;

public class ElementAsIndex { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = arr[arr[i]];
        }
        for(int i=0; i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
