package Solution;
public class rotateArrayByOne {
    
public int[] rotatebyone(int nums[]){
    int n = nums.length;
    int temp = nums[0];
    for(int i=0;i<n;i++) {
        nums[i-1] = nums[i];
    }
    nums[n-1]=temp;

    return nums;
}


}
