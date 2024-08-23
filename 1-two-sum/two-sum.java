class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        int sol[]= new int[2];
        for(int i=0; i<nums.length; i++){
            if(!hm.isEmpty()&&hm.containsKey(target-nums[i])){
                sol[0]=i;
                sol[1]=hm.get(target-nums[i]);
                break;
            }
            hm.put(nums[i], i);
              
        }

return sol;

            

        
    }
    
}