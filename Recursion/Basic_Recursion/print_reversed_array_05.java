package Recursion.Basic_Recursion;
import java.util.Arrays;

public class print_reversed_array_05 {
    
    public static int[] reverseArray(int arr[],int lp,int rp){
        if (lp >= rp) return arr;
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;
        return reverseArray(arr, lp + 1, rp - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int lp= 0;
        int rp= arr.length - 1;
        System.out.println(Arrays.toString(reverseArray(arr, lp, rp)));
        
    }
}
