class Solution:
    def minElement(self, nums: List[int]) -> int:
        return min(sum(map(int,str(v))) for v in nums)
        