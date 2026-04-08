package Sorting;
public class insertionsort {

public static void printArr(int arr[]){
    int n = arr.length;
    for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
    }
}
public static void insertionSort(int arr[]){
    int n = arr.length;
    for(int i=1;i<n;i++){
        int value = arr[i];
        int j = i-1;
        while (j>=0 && arr[j] > value) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1] = value;
    }
}
    public static void main(String[] args) {
        int arr[] = {40,20,50,60,30,10};
        insertionSort(arr);
        printArr(arr);
    }
    
}

