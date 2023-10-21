//See problem statement from below link
//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/sumit-and-rohil/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numinputs = Integer.parseInt(br.readLine());
        Integer count = 0;
        List<String> inplist=new ArrayList<String>();
        List<List<String>> outlist = new ArrayList<List<String>>();
        for(Integer i=0; i<numinputs; i++){
            String inp = br.readLine();
            inplist.add(inp);
        }
        for(Integer j=count; j<inplist.size(); j++){
            List<String> output=new ArrayList<String>();
            boolean ispresent = false;
            for(List<String> str:outlist){
                if(str.contains(inplist.get(j))){
                    ispresent = true;
                    break;
                }
                else
                    ispresent = false;
            }
            if(ispresent==false){
            output.add(inplist.get(j));
            char[] str1 = inplist.get(j).toCharArray();
            List<String> outstr1=new ArrayList<String>();
            for(char c:str1){
                outstr1.add(Character.toString(c));
            }
            for(Integer k=count+1; k<inplist.size(); k++){
                char[] str2 = inplist.get(k).toCharArray();
                List<String> outstr2=new ArrayList<String>();
                    for(char c:str2){
                        outstr2.add(Character.toString(c));
                }
                if(outstr1.size()==outstr2.size() && outstr1.get(0).equals(outstr2.get(0)) && outstr1.get(outstr1.size()-1).equals(outstr2.get(outstr2.size()-1))
                  ){
                   Arrays.sort(str1);
                    Arrays.sort(str2);
                    if(Arrays.equals(str1, str2)){
                        output.add(inplist.get(k));
                    }
                }
            }}
            if(!output.isEmpty())
            outlist.add(output);
            count++;
        }                
        System.out.println(outlist.size());    
    }
}
