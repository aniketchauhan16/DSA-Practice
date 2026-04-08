package Solution;
public class RotateArrayByNPlaces_optimal {
    
public static void Reverse(int nums[],int start,int end){
    while (start>= end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }

}
    public static void Rotatetoright(int[] nums,int k){
int n =nums.length;
        Reverse(nums, 0, n-k-1);
    }
    
    
    public static void main(String args[]) {
    int[] nums = {1,2,3,4,5,6,7};
    int k = 2;
    Rotatetoright (nums, k);
    System.out.print("After Rotating the k elements to right ");
    for (int i = 0; i < nums.length; i++)
      System.out.print(nums[i] + " ");
    System.out.println();
  }
}
