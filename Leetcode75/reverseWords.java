Refer problem statement from 
https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseWords(String s) {
        String input = s.trim();
        input = input.replaceAll("\\s+",",");
        String output = "";
        String[] inputlist = input.split(",");
        for(int i=inputlist.length-1; i>=0; i--){
            output = output + " " + inputlist[i];
        }
        return output.trim();
    }
}
