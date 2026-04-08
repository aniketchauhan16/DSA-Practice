package Arrays;
import java.util.*;
public class arraysLongestConsecutivesubseq {

    class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
       int cnt =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]+1 == arr[i+1]) {
                cnt++;
            }
        }
        return cnt;
    }
}
}