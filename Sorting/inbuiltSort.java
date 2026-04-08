package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
public static void printArr(Integer arr[]){  // Integer arr for object such as collection & int for primitive datatypes
    int n = arr.length;
    for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
    }
}
// public static void main(String[] args) {
//     int arr[] = {5,4,1,3,2};
//     Arrays.sort(arr);
//     printArr(arr);
// }
 
public static void main(String[] args) {
    Integer arr[] = {5,4,1,3,2};
    Arrays.sort(arr,0,4,Collections.reverseOrder());
    printArr(arr);
}
}

