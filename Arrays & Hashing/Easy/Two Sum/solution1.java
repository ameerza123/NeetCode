// One Pass Hash Map

import java.util.HashMap;

public class solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>(); //HashMap with {difference : index}
        int difference = 0;
        int[] indices = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i]; // Current diff required to get target

            if (diffMap.containsKey(difference)) { // Check if required diff exists in diffMap
                indices[0] = diffMap.get(difference);
                indices[1] = i;
                return indices;
            } else {
                diffMap.put(nums[i], i); // Required diff not found, add to diffMap
            }
        }
        
        return indices;
    }
}
