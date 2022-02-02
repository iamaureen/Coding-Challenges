package LeetCode;


//https://leetcode.com/problems/palindrome-permutation/

public class p266_can_pallindrome {
    public boolean canPermutePalindrome(String s) {
        
        HashMap < Character, Integer > map = new HashMap < > ();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int count = 0;
        
        // if the character exists even number of time, it can be rearranged to a pallindrome
        // at most one character can exist exactly once to be a pallindrom (odd length)
        // so count can be at most 1; anything greater than 1 means there are characters that would not 
        //let a permutation of the given string to be a pallindrome
        
        for (char key: map.keySet()) {
            
            count += map.get(key) % 2; 
            
        }
        
        return count <= 1;

    }

}
