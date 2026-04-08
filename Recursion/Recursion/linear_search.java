package Recursion.Recursion;


public class linear_search {
    
    public static void main(String[] args) {
       int arr[] = {2,4,7,3,11,8,12};
       int n = arr.length-1;
       int i = 0;
       int target =8;
      int x = linearSearch(arr, n, target, i);
      System.out.println(x);
    }

    public static int linearSearch(int arr[],int n,int target,int i){

            if(i>=n) return -1;

            if (arr[i] == target) return i;

            return linearSearch(arr, n, target, i+1);
    }
}
