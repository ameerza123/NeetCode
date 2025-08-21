class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # Loop through length of first string in array
        for i in range(len(strs[0])):
            # Loop through each string in array
            for s in strs:
                # Checks if current index is the length of the string OR
                # if current char of string does not match same char in first string
                if i == len(s) or s[i] != strs[0][i]:
                    # Return substring from first char to index i as LCP
                    return s[:i]
        # Entire first word is LCP
        return strs[0]