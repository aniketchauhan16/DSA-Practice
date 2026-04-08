package Recursion.Basic_Recursion;

public class print_array {
    public static void main(String[] args) {
        int arr[] = {5,3,6,9,4};
       int n=0;
        printArr(n,arr);
    }

    public static void printArr(int n, int arr[]){
        int x = arr.length;
        if (x==n) {
            return;
        }
        System.out.print(arr[n] + " ");
        printArr(n+1, arr);
    }
}
