package Recursion.Recursion;

public class binary_search {
    
    public static void main(String[] args) {
        
        int arr[] = {2,5,6,8,9,11,22,25};
        int target = 4;
        int start =0;
        int end = arr.length-1;
        System.out.println(isPresent(arr,start,end,target));
    }

    public static boolean isPresent(int[] arr,int start,int end,int target){
            if (start>end) return false;
            int mid =  (start+ (end - start)/2);
            if  (arr[mid] == target) return true;
           if (target > arr[mid]) {
            return isPresent(arr, mid + 1, end, target);
        } else {
            return isPresent(arr, start, mid - 1, target);
        }

    }
}
