package Recursion.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subset_sum {
    public ArrayList<Integer> subsetSums(int[] arr) {
         ArrayList<Integer> sumSubset = new ArrayList<>();
        int index =0;
        int sum =0;
        int n = arr.length;
        subset(arr,index,sum,n,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;

    }

    public  void subset(int[] arr,int index,int sum,int n,ArrayList<Integer> sumSubset){
        if (index == n) {
            sumSubset.add(sum);
            return;
        }
        subset(arr, index+1, sum+ arr[index], n, sumSubset);
        subset(arr, index+1, sum, n, sumSubset);
    }
}
