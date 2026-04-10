
public class arraysBinarySearch { 

    public static int search(int numbers[] , int key) {
        int start = numbers[0];          int end = numbers.length -1;      
        while(start<=end) {
                    int mid = (start + end)/2; 
          if (numbers[mid] == key) {
            return mid;
          }
          else if ( numbers[mid] > key) {
            end = mid-1;
          }
          else {
            start = mid + 1;
          }
        } return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,3,6,9,12,16,19};
        int key = 9;
     search(numbers , key);
     System.out.println("Element to be found is present at: " + search(numbers, key));
    }
    
}

