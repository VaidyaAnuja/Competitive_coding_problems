Refer problem statement from
https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left<right){
            maxArea = Math.max((right-left)*Math.min(height[left], height[right]),maxArea);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}