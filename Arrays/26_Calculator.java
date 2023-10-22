import java.util.*;

public class 26_Calculator {
    public static int[] calculator(int arr[], int k){
        int c = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(c==1){
                if(arr[i]==9){
                    c=1;
                    arr[i] = 0;
                } 
                else{
                    arr[i] += 1;
                    return arr;
                } 
            } else if(arr[i]+k > 9){
                arr[i] = (arr[i]+k)%10;
                c=1;
            } else if(arr[i]+k < 9){
                arr[i] = arr[i]+k;
                return arr;
            }
        }
        int res[] = new int[arr.length+1];
        arr[0] = 1;
        for(int i=0; i<res.length; i++){
            res[i] = arr[i-1];
        }
        return res;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = calculator(arr,k);
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
    }
}