Refer problem statement from
https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean isSubsequence(String s, String t) {
        
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char sarray[]=s.toCharArray();
    char tarray[]=t.toCharArray();

    if(m<1)
        return true;
    if(m>n)
        return false;
    while(i<n){
        if(tarray[i]==sarray[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    }
}