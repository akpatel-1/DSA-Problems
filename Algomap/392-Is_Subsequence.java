/*
Problem: 392. Is Subsequence
Link: https://leetcode.com/problems/is-subsequence/description/
 
Approach: Initialize count = 0 and str = "", loop t array If count < s.length() and s[count] == t[i]:
Append s[count] to str.
Increment count.
Return true if str == s, otherwise return false.

TC: O(n) iterate hrough each character in string t.
SC: O(m)  grow to the size of s worst case.
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0 ; 
        String str = "";
        for(int i=0 ; i<t.length() ; i++){
            if(count < s.length() && s.charAt(count) == t.charAt(i)){
                str += s.charAt(count);
                count++;
            }
        }
        if(str.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}