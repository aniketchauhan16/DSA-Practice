package Sorting;
public class selectionSort {

public static void selectionsort(int arr[]) {
    for(int i = 0;i<arr.length;i++) {
        for(int j=i;j<arr.length;j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
public static void printarr(int arr[]){
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

public static void main(String[] args) {
    int arr [] = {5,3,1,8,2};
    selectionsort(arr);
   printarr(arr);
}
}

