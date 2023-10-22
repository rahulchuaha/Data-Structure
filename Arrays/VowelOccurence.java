import java.util.*;

public class VowelOccurence {
    public static int Vowel(char arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') 
                 return i;
                 
        }
         return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
         int res = Vowel(arr);
        System.out.println(res);
         
    }
}