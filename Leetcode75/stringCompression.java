Refer problem statement from
https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75


class Solution {
    public int compress(char[] chars) {
        List<Character> newchar = new ArrayList<>();
        char refchar = chars[0];
        int numbeofinstances = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] == refchar){
                numbeofinstances = numbeofinstances + 1;
            }
            else{
                newchar.add(refchar);
                if(numbeofinstances>1 && numbeofinstances<10){
                   newchar.add(Character.forDigit(numbeofinstances, 10)); 
                }
                else if(numbeofinstances>=10){
                    String s = Long.toString(numbeofinstances);
                    for (int n = 0; n < s.length(); n++) {
                        newchar.add(s.charAt(n));
                    }
                }
                refchar = chars[i];
                numbeofinstances = 1;
            }
            if(i==chars.length-1){
                newchar.add(refchar);
                if(numbeofinstances>1 && numbeofinstances<10){
                   newchar.add(Character.forDigit(numbeofinstances, 10)); 
                }
                else if(numbeofinstances>=10){
                    String s = Long.toString(numbeofinstances);
                    for (int n = 0; n < s.length(); n++) {
                        newchar.add(s.charAt(n));
                    }
                }
            }
            
        }
        System.out.println(newchar);
        for(int j=0; j<newchar.size(); j++){
            chars[j] = newchar.get(j);
        }
        return newchar.size();
    }
}
