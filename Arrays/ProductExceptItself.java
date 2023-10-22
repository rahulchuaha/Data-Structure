import java.util.*;
public class ProductExceptItself {
    public static int[] productItself(int arr[]){
        int product = 1;
        for(int i=0; i<arr.length; i++)
            product = product*arr[i];
        
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            res[i] = product/arr[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int[] res = productItself(arr);
        for(int i=0; i<n; i++)
        System.out.println(res[i]);
    }
}