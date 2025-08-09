class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        list_len = len(nums)
        if list_len == 0:
            return 0
        if list_len == 1:
            return 1
        
        max_len = 0
        l = 0
        zeros = 0
        
        for r in range(list_len):
            if nums[r] == 0:
                zeros += 1
            while zeros > k:
                if nums[l] == 0:
                    zeros -= 1
                l += 1
            max_len = max(max_len, r - l + 1)
        
        return max_len
                


        