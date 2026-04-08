package Recursion.Basic_Recursion;

public class print_array_sum {
      public static void main(String[] args) {
        int arr[] = {5,3,6,9,4};
       int sum=0;
       int i=4;
        int x = printArrSum(i,arr,sum);
        System.out.println(x);
    }
    public static int printArrSum(int i,int[] arr,int sum) {
        if (i==-1) {
            return sum;
        }
        sum += arr[i];
        return printArrSum(i-1, arr, sum);
    }
    
}
