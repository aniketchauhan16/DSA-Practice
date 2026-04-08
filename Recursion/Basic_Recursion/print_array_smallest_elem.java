package Recursion.Basic_Recursion;


public class print_array_smallest_elem {
        public static void main(String[] args) {
            int arr[] = {5,8,1,4,2};
            int minmelem = Integer.MAX_VALUE;
            int i = arr.length-1;
           int x = PrintSmallElem(arr,i,minmelem);
           System.out.println(x);
        }
        public static int PrintSmallElem(int[] arr,int i,int minmelem){
            if (i==-1) {
                return minmelem;
            }
            minmelem = Math.min(arr[i], minmelem);
            return PrintSmallElem(arr, i-1, minmelem);
        }
}
