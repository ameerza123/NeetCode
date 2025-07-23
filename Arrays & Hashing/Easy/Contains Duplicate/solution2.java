// Hash Set Solution

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); //Hash Set containing visited numbers

        for (int num : nums) { // Loop through all numbers in array
            
            if (seen.contains(num)) { // Checks if hash set already has this number (duplicate found), if so return true
                return true;
            }

            seen.add(num); // Number is not already in hash set, so add it in
        }

        return false; // No duplicates were found
    }
}