class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_set = set() # HashSet for seen numbers

        # Loop through each number in list
        for n in nums:
            if n in seen_set:
                return True # Number found in set, so duplicate found
            seen_set.add(n) # Number not already in set
        
        return False