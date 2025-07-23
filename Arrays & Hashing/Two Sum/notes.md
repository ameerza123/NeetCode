# Initial Thoughts

We are given one integer array and one integer target.
We need to return two indices such that their values add up to the target.

- Brute force solution would be to use 2 pointers, and loop through every combination to see which ones add up to the target

# Solution 1

After a bit of trial and error I was actually able to get close to the most optimal solution without looking at the solutions.
I still had to look at the hints to get the best understanding though.

difference = target - nums[i]

e.g.,
nums [3, 4, 5, 6], target = 7
7 - nums[i] = difference

diffMap = {diff : index}

7 - nums[0] = 7 - 3 = 4
7 - nums[1] = 7 - 4 = 3
7 - nums[2] = 7 - 5 = 2
7 - nums[3] = 7 - 6 = 1

Loop through nums, get diff = target - nums[i], check if diff exists in diffMap (return indices if they do)