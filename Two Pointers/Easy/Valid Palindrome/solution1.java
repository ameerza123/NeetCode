// Two Pointer Solution

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; // Pointer 1 from start of s
        int j = s.length() - 1; // Pointer 2 from end of s

        while (i < j) { // Loops until pointers meet

            while (i < j && isAlphanum(s.charAt(i)) == false) { // Pointer moves to alphanumeric char
                i++;
            }

            while (j > i && isAlphanum(s.charAt(j)) == false) { // Pointer moves to alphanumeric char
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean isAlphanum(char ch) { // Helper function to check if a char is alphanumeric
        if ((ch >= '0' & ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alpha: " + ch);
            return true;
        } else {
            System.out.println("NON: " + ch);
            return false;
        }
    }
}
