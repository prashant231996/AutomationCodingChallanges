package com.javaProgram.codingChallange;

public class PalindromSubstring {
	
	// Function to check if a substring 
    // s[i..j] is a palindrome
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int countPS(String s) {
        int n = s.length();

        // Consider all possible substrings of lengths
        // more than 1
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
          
                // If substring from i to j is palindrome
                // increment the result
                if (isPalindrome(s, i, j)) 
                {
                    res++;
                    System.out.println("Substrings are :"+s.substring(i,j));
                }
            }
        }

        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
        System.out.println(countPS(s));

	}

}
