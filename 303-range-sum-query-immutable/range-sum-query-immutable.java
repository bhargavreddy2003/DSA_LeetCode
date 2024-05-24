class NumArray {
int[] psum;
public NumArray(int[] nums) { 
    psum = new int[nums.length];
    psum[0] = nums[0];
    for(int i = 1; i < nums.length; i++)
        psum[i] = psum[i - 1] + nums[i];
    
   
}

public int sumRange(int i, int j) {
    if(i == 0)
        return psum[j];
    
    return psum[j] - psum[i - 1];
}
}
