import java.util.*;

public class SolveArray 
{
    public static int[] solveArray(int arr[], int index[]){
        int n = arr.length;
        int target[] = new int[n];
        for(int i=0; i<n; i++){
            target[index[i]] = arr[i];
        }
        return target;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int index[] = new int[n];
        for(int i=0; i<n; i++){
            index[i] = sc.nextInt();
        }
        int target[] = solveArray(arr,index);
        for(int i=0; i<n; i++){
            System.out.print(target[i]+" ");
        }
    }
}