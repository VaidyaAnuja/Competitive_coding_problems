Refer problem from
https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        if(word1.length()<word2.length()){
            for(int i=0;i<word1.length();i++){
               output = output + word1.substring(i,i+1) + word2.substring(i,i+1);
            }
            output = output + word2.substring(word1.length(),word2.length());
        }
        else{
            for(int i=0;i<word2.length();i++){
               output = output + word1.substring(i,i+1) + word2.substring(i,i+1);
            }
            output = output + word1.substring(word2.length(),word1.length());
        }
        return output;
    }
}

