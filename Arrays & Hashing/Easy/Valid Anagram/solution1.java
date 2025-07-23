// Hash Map Solution

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { // Strings are different lengths, so can't be anagrams
            return false;
        }
        
        HashMap<Character, Integer> sFreq = new HashMap<>(); // Contains frequency of chars in s
        HashMap<Character, Integer> tFreq = new HashMap<>(); // Contains frequency of chars in t

        // Fill out both HashMaps with freq of each char in strings
        for (int i = 0; i < s.length(); i++) {
            char sAdd = s.charAt(i);
            char tAdd = t.charAt(i);

            if (sFreq.containsKey(sAdd)) { // Checks if char is already in sFreq
                sFreq.put(sAdd, sFreq.get(sAdd) + 1);
            } else {
                sFreq.put(sAdd, 1);
            }

            if (tFreq.containsKey(tAdd)) { // Checks if char is already in tFreq
                tFreq.put(tAdd, tFreq.get(tAdd) + 1);
            } else {
                tFreq.put(tAdd, 1);
            }
        }

        // Compare values in both HashMaps
        if (sFreq.equals(tFreq)) {
            return true;
        } else {
            return false;
        }

    }
}
