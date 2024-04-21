Refer problem statement from
https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);
        int curr = 1;
        for(int i=0; i<=nums.length-1; i++){
           output[i] = output[i]*curr;
           curr = curr*nums[i]; 
        }
        curr = 1;
        for(int i=nums.length-1; i>=0; i--){
           output[i] = output[i]*curr;
           curr = curr*nums[i];  
        }
        return output;
}}
