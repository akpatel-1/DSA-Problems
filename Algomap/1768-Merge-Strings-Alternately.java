/*
Problem: 1768. Merge Strings Alternately
Link: https://leetcode.com/problems/merge-strings-alternately/description/
 
Approach: Initilize merged = "" iterate both string { merged += word1.charAt(i);  merged += word2.charAt(i);} append remaining string.

TC: O(m + n) loop iterates at most O(max(n, m)) times.
SC: O(m + n) worst case, it stores all characters of word1 and word2
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int i = 0 ;
        for(i=0 ; i<Math.min(word1.length() , word2.length()) ; i++){
        merged += word1.charAt(i);
        merged += word2.charAt(i);
        }
        merged += word1.substring(i) + word2.substring(i);
        return merged;
    }   
}