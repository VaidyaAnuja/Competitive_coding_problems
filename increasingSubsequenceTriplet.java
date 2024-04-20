Refer problem statement from
https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
        if ( nums[i] <= first && nums[i] < second) {
            first = nums[i];
        }
        if ( nums[i] <= second && nums[i] > first) {
            second = nums[i];
        }
        if ( nums[i] > first && nums[i] > second ) {
            return true;
        }
    }
    return false;
    }
}