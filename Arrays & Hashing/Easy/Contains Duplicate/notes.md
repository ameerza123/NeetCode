# Solution 1 - Brute Force

Initial thoughts:
- Variable storing current item in list
- Loop through list comparing current variable to all other items in list
- If same value, return true

Time Complexity: O(n^2) - two nested loops iterating over array of size n
Space Complexity: O(1) - no extra data structures

Solution did work, but has poor time and space complexity as it is a brute-force method.
Reading the question hints suggests that a better solution would require the use of a hash set.

# Solution 2 - Hash Set

- Create hash set
- Loop through all numbers in array
- Check if number is already in hash set, if so return true
- If not, add number to hash set

Time Complexity: O(n) - requires one loop over array of size n
Space Complexity: O(n) - added hash set size of n

# Successful Solution Attempts
(Attempts made to solve the problem without looking at any hints/solutions)

- 26/07/25