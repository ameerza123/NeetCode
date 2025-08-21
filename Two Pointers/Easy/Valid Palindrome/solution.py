class Solution:
    def isPalindrome(self, s: str) -> bool:
        # Left pointer starts at first ch
        # Right pointer starts at last ch
        l = 0
        r = len(s) - 1

        # Loops until left pointer meets right pointer
        while l < r:

            # Increments pointers as long as they have not met AND
            # char is not alphanumeric
            while l < r and not self.alphaNum(s[l]):
                l += 1
            while r > l and not self.alphaNum(s[r]):
                r -= 1

            # If char of each pointer does not match, it is not a palindrome
            if s[l].lower() != s[r].lower():
                return False
            
            # Increment pointers
            l += 1
            r -= 1
        
        # All alphanumeric chars match, so it is a palindrome
        return True

    # Helper function to determine if char is alphanumerical
    def alphaNum(self, c):
        return (ord('A') <= ord(c) <= ord('Z') or
                ord('a') <= ord(c) <= ord('z') or
                ord('0') <= ord(c) <= ord('9'))