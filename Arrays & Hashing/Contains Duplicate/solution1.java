public class solution1 {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        
        int foo = nums[0];
        int bar = nums[0];
        for (int i = 0; i < nums.length; i++) {
            foo = nums[i];
            for (int j = 0; j < nums.length; j++) {
                bar = nums[j];
                if (foo == bar && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
