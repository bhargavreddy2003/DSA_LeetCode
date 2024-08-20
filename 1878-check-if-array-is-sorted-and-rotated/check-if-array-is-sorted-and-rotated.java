class Solution {
    public boolean check(int[] nums) {
        int check=0;
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                check++;
            }
        }
        if(nums[0]<nums[nums.length-1]) check++;
        return check<=1;
       


    }
}