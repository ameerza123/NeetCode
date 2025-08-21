class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [0] * (2 * n) # Creates empty array of length 2*length of nums

        # Loop through each num in array with counter i
        for i, num in enumerate(nums):
            ans[i] = num # Adds first instance of num at index i
            ans[i + n] = num # Adds second instance of num at index i + n
        
        return ans