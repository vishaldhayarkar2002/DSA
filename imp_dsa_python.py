# 198. House Robber
class Solution(object):
    def rob(self, nums):
        if len(nums) == 1:
            return nums[0]

        dp = [0] * len(nums)
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])

        for i in range(2, len(nums)):
            dp[i] = max(nums[i] + dp[i-2], dp[i-1])

        return dp[-1]
            
class Solution(object):
    def partitionLabels(self, s):
        last = {c: i for i, c in enumerate(s)}

        result = []
        start = 0
        end = 0

        for i, ch in enumerate(s):
            end = max(end, last[ch])

            if i == end:
                result.append(end - start + 1)
                start = i + 1

        return result
        