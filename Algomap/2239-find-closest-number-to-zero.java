/*
Problem: 2239. Find Closest Number to Zero
Link: https://leetcode.com/problems/find-closest-number-to-zero/description/
 
Approach: Initialize ans=nums[0] , iterate nums if nums[i]==0 return 0;
          else if(|nums[i]| < |ans|, update ans || nums[i] == |ans|, store the maximum value in ans) return ans;

TC: O(n) single loop
SC: O(1) primitive data used
 */

class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for(int i=0 ; i<nums.length; i++){
         if(nums[i]==0) return 0;

         else if(Math.abs(nums[i])<Math.abs(ans) || nums[i]==Math.abs(ans) && nums[i]>ans)
         {
            ans = nums[i];
         }
        }
        return ans;
    }
}