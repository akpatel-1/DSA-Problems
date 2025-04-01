/*
Problem: 392. Is Subsequence
Link: https://leetcode.com/problems/is-subsequence/description/
 
Approach: Initialize count = 0, loop t array If count < s.length() and count<s.length(), if s.charAt(count)==t.charAt(i) count++;
return count == s.length();

TC: O(n) when n=t.length();
SC: O(1) only two int variable count and i.
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        for(int i=0 ; i<t.length() && count<s.length() ; i++){
            if(s.charAt(count)==t.charAt(i)){
                count++;
            }
        }
        return count == s.length();
    }
}