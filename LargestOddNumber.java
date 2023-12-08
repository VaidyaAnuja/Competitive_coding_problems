Refer problem statement from
https://leetcode.com/problems/largest-odd-number-in-string/

class Solution {
    public String largestOddNumber(String num) {
        String output = "";
        for(int i=num.length(); i>0; i--){
            if(Integer.parseInt(num.substring(i-1,i))%2!=0){
                output = num.substring(0,i);
                break;
            }
        }
        return output;
    }
}
