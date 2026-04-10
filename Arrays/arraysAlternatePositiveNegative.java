
import java.util.*;
public class arraysAlternatePositiveNegative {


    class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> listp = new ArrayList<>();
        ArrayList<Integer> listn = new ArrayList<>();
        int n = arr.size();
        int cnt1 = 0;
        int cnt2 = 0;
         for(int i=0;i<n;i++){
            if (arr.get(i) >= 0) {
                listp.add(arr.get(i));
            }
            else{
                listn.add(arr.get(i));
            }
        }
        cnt1 = listp.get(0);
        cnt2 = listp.get(0);
        for(int i=0;i<n;i++){
            if (arr.get(i)/2 == 0) {
                arr.set(i,listp.get(cnt1++));
            }
            else{
                  arr.set(i,listp.get(cnt2++));
            }
        }
    }
    
}
    

}
