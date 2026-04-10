
package Solution;
public class TwoSum {

    public static int[] twosum(int nums[] ,int target){
        
        int n  = nums.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        int left=0,right = n-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
            return ans;
            }
            if (sum < target) {
                left++;
            }
            else {
                right --;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2,6,5,8,11};
        int target = 14;
        int ans[] = twosum(nums , target);
        System.out.println("This is the answer [" + ans[0] + "," + ans[1] + "]");
    }
}

