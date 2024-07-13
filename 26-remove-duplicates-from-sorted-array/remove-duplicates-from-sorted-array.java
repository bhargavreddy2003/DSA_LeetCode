class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int l=nums.length;
         
        for(int i=1; i<l; i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                
                
            }
            
             
        }
        return j+1;
    }
   
}