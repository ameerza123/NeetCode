class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False # Can't be anagrams if strings are of diff lengths
        
        sFreq = {} # HashMap stores frequency of each char in s
        tFreq = {} # HashMap stores frequency of each char in t

        # Loops through length of the string
        # Adds each char from the respective string to the respective HashMap
        # Increments counter by 1 + existing count of char in the HashMap
        for i in range(len(s)):
            sFreq[s[i]] = 1 + sFreq.get(s[i], 0)
            tFreq[t[i]] = 1 + tFreq.get(t[i], 0)
        
        # If both HashMaps are equal, the frequence of each char is the same
        return sFreq == tFreq