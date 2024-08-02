class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage;
        int windowSum=0;
        int left=0;
        double maxSum;
        if(k>nums.length) return -1;
        for(int i=left;i<k;i++){
            windowSum=windowSum+nums[i];
        }
        maxSum=windowSum;
        for(int j=k;j<nums.length;j++){
            windowSum=windowSum+nums[j]-nums[j-k];
          maxSum=Math.max(maxSum,windowSum);
        }
        maxAverage=maxSum/k;
        return maxAverage;
       

    }
}