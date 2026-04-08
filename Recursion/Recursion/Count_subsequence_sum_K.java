package Recursion.Recursion;
import java.util.*;
public class Count_subsequence_sum_K {
    static int[] arr = {1,2,1};
    static int n = arr.length;
    static int targetSum = 2;
    
    public static void main(String[] args) {
        List<Integer> ds = new ArrayList<>();
        fun(0,ds,0);
    }

    static int fun(int i,List<Integer> ds,int s){
        if (i==n) {
            if (s==targetSum) {
                System.out.println(ds);
                return 1;
            }
            return 0;
        }
        ds.add(arr[i]);
        s+= arr[i];
        int l = fun(i+1, ds, s);
        ds.remove(ds.size() - 1);
        s-= arr[i];
        int r = fun(i+1, ds, s);
        return l+r;
    }

}
