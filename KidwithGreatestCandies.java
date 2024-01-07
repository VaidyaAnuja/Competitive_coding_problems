Refer problem statement from
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> outputcandies = new ArrayList<Boolean>();
        int[] sortedcandies = new int[candies.length];
        for(int j=0; j<candies.length; j++){
            sortedcandies[j]=candies[j];
        }
        Arrays.sort(sortedcandies);
        int greatestnoofCandies = sortedcandies[sortedcandies.length-1];
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=greatestnoofCandies)
            outputcandies.add(true);
            else
            outputcandies.add(false);
        }
        return outputcandies;
    }
}