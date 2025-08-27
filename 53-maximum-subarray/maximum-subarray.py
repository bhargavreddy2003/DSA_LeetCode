class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum=nums[0]
        max_sum_subarray=nums[0]
        for i in range(1,len(nums)):
           max_sum_subarray = max(nums[i], max_sum_subarray+nums[i])
           max_sum=max(max_sum, max_sum_subarray)
        return max_sum

            
            
        