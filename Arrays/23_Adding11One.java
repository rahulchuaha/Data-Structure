import java.util.*;

public class Adding11One {
    public static int[] addOne(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
             else{
                 arr[i] = 0;
             }
        }
        int res[] = new int[arr.length+1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = addOne(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
