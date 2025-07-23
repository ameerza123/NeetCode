// Brute Force Solution

class Solution1 {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) { // Checks if array is too small to contain duplicates, so return false
            return false;
        }
        
        int foo = nums[0]; // Pointer 1
        int bar = nums[0]; // Pointer 2

        for (int i = 0; i < nums.length; i++) { // Loops through all of array
            foo = nums[i]; // Pointer 1 set to first int in array

            for (int j = i+1; j < nums.length; j++) { // Loops through array again
                bar = nums[j]; // Pointer 2 set to int after pointer 1

                if (foo == bar) { // Checks if values of pointers match (duplicate found)
                    return true;
                }
            }
        }

        return false; // No duplicates found
    }
}