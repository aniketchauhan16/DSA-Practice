package Arrays;
public class arraysSecondLargest {
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        if (slargest == Integer.MIN_VALUE) {
            return -1;
        }
        return slargest;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int x = getSecondLargest(arr);
        System.out.println(x);
    }
}

