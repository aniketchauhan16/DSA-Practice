package Solution;
public class MoveZeroToEND {

    public static void zeroesatend(int arr[]){
        int j=-1;
        int n = arr.length;
        for(int i= 0;i<n;i++){
            if (arr[i] == 0) {
                j=i;
                break;
            }
        }
        
        for(int i = j+1; i < n; i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        zeroesatend(arr);
        printarray(arr);
    }
    
}