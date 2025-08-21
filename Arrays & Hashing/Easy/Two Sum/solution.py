class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffMap = {}  # HashMap to store {Difference : Index}

        # Loop through array nums with counter i and iterable n
        for i, n in enumerate(nums):
            # Difference required to reach the target from current number
            diff = target - n

            # If the required difference already exists in diffMap
            # return its set index and the index of the current number
            if diff in diffMap:
                return [diffMap[diff], i]

            # Required difference not found yet, add current difference to diffMap
            diffMap[n] = i