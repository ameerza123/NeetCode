# Solution 1

Initial thoughts:
- Variable storing current item in list
- Loop through list comparing current variable to all other items in list
- If same value, return true

Time Complexity: O(n^2) - two nested loops iterating over array of size n
Space Complexity: O(1) - no extra data structures

Solution did work, but has poor time and space complexity as it is a brute-force method.
Reading the question hints suggests that a better solution would require the use of a hashmap.

# Solution 2

