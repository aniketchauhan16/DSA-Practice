
package Solution;

public class MaxConsecutiveOnes {
      public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max1s = 0;
        for(int i =0; i <nums.length; i++) {
            if (nums[i]==1) {
                count++;
                max1s = Math.max(max1s, count);
            }
            else{
                count = 0;
            }
        }
        return max1s;
            }

    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
       System.out.println(findMaxConsecutiveOnes(nums)); 
    }
}
