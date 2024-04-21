Refer problem statement from
https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        return true;
        int lenofflowerbed = flowerbed.length;
        if(lenofflowerbed>1){
        if(n>0 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n=n-1;
        }
        if(n>0 && flowerbed[lenofflowerbed-1]==0 && flowerbed[lenofflowerbed-2]==0){
            flowerbed[lenofflowerbed-1]=1;
            n=n-1;
        }
        for(int i = 1; i < lenofflowerbed-1; i++){
            if(n>0){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
            flowerbed[i]=1;    
            n=n-1;
            }
            }
            else
            break;
            
        }}
        else{
            if(flowerbed[0]==0 && n<=1)
            return true;
            else
            return false;
        }
        if(n==0)
        return true;
        else
        return false;
    }
}
