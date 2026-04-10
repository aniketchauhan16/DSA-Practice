package Solution;
 public class maxSubArray {
 
    
     public static int maxSubArrays(int[] nums) {
         int ms = Integer.MIN_VALUE;
         int cs = 0;

        for(int i=0;i<nums.length;i++){
            cs += nums[i];
            ms = Math.max(cs, ms);
        }
        if (ms<0) {
            return ms;
        }
        
        else{
            for(int i =0;i<nums.length;i++) { 
                cs += nums[i];
                if (cs<0) {
                    cs=0;
                }
                ms = Math.max(cs, ms);
            }
            return ms;
            
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,-5,-6,-8,-3};
        System.out.println(maxSubArrays(nums));;
    }
    
}