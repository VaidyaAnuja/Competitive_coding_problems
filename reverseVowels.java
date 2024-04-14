Refer problem statement from 
https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75


class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = new ArrayList<String>();
        String[] input = s.split("");
        ArrayList<String> strList = new ArrayList<String>( 
            Arrays.asList(input));
        int index = 0;
        for(String c: strList){
            if(c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") ||       		c.equalsIgnoreCase("u")){
                vowels.add(c);
            }
        }
        
        index = vowels.size() - 1;
        for(int i=0; i<strList.size(); i++){
            if(strList.get(i).equalsIgnoreCase("a") || strList.get(i).equalsIgnoreCase("e") || strList.get(i).equalsIgnoreCase("i") || 	strList.get(i).equalsIgnoreCase("o") || strList.get(i).equalsIgnoreCase("u")){
                strList.set(i,vowels.get(index));
                index = index - 1;
            }
        }
        String output = String.join("",strList);
        return output;
    }
}