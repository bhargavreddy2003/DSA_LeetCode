class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        def atMost(S):
            if S < 0:
                return 0
            l = 0
            total = 0
            count = 0
            for r in range(len(nums)):
                total += nums[r]%2 
                while total > S:
                    total -= nums[l] %2
                    l += 1
                count += (r - l + 1)  
            return count
        return atMost(k) - atMost(k - 1)

        