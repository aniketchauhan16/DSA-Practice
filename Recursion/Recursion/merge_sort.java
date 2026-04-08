package Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class merge_sort {
   
    public int[] sortArray(int[] nums) {
        int low =0;
        int high = nums.length-1;
        
       mergeSort(nums,low,high);
       return nums;
            }

    public void mergeSort(int[] arr,int low,int high){
        if (low== high) return;
        
        int mid = (high+low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    
     public void merge(int[] arr,int low,int mid,int high){
         List<Integer> temp = new ArrayList<>();
        int left =low;
        int right = mid+1;
        while (left<=mid && right <=high  ){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            }
            else temp.add(arr[right++]);
        }
        while (left<= mid) {
            temp.add(arr[left++]);
        }
        while (right<= high) {
            temp.add(arr[right++]);
        }
         for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    
    
    }
}
