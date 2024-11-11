from typing import List  # Import List from the typing module

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i in range(len(nums)):
            if target - nums[i] in d:
                return [d[target - nums[i]], i]
            d[nums[i]] = i

# Testing the function
o = Solution()
print(o.twoSum([2, 7, 11, 15], 9))
