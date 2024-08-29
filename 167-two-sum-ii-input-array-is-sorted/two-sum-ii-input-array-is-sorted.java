class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sol= new int[2];
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        while(left<right){
             sum=numbers[left]+numbers[right];
             if(sum==target){
                sol[0]=left+1;
                sol[1]=right+1;
             }
             if(sum<target){
                left++;
                
             }
             else right--;

        }
        return sol;
    }
}