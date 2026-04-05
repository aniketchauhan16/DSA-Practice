package Arrays;
import java.util.ArrayList;

public class arraysRemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if (arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }
         return list;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2};
      System.out.println(removeDuplicates(arr));

    }
}
