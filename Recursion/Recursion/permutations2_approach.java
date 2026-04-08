package Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations2_approach {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permutations(0,n,arr,ans);
        return ans;
    }
    public static void permutations(int index,int n,int[] arr,ArrayList<ArrayList<Integer>>  ans){
        if (index == n) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
        }
        for (int i = index; i < arr.length; i++) {
            swap(i,index,arr);
            permutations(index+1, n, arr, ans);
            swap(i,index,arr);
        }
    }
    public static void swap(int i,int j,int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
