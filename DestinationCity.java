Refer problem statement from
https://leetcode.com/problems/destination-city/?envType=daily-question&envId=2023-12-15

class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> outputpath = new ArrayList<String>();
        outputpath.add(paths.get(0).get(1));
        for(int j=0; j<outputpath.size(); j++){
            for(int i=1; i<paths.size(); i++){
                  if(paths.get(i).get(0).equals(outputpath.get(j)))
                    outputpath.add(paths.get(i).get(1));
          }
        }
        return outputpath.get(outputpath.size()-1);
    }
}
