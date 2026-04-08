package Arrays;
public  class arraySortedRotated   {
     public static boolean check(int[] nums) {
        int cnt =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[(i + 1) % nums.length]) {
                cnt++;
            }
        if(cnt > 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        System.out.println(check(nums));
    }
}
