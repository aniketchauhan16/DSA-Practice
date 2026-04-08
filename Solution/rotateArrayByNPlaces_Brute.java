package Solution;
class rotateArrayByNPlaces_Brute{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[k];
        //temperory storing last values
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)] = nums[i];
        }
        //rotating values to right 
        for(int i=n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        //puting value of temp
        for(int i = 0;i<k;i++){
            nums[i] = temp[i];
        }
    }
    public static void main(String args[]) {
    int[] nums = {1,2,3,4,5,6,7};
    int k = 2;
    rotate(nums, k);
    System.out.println("After Rotating the elements to right ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

}