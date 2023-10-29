//See problem statement from below link
//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/sumit-and-rohil/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int countofO = 0;
        int countofZ = 0;
        for(int i = 0; i<name.length(); i++) {
            char a = name.charAt(i);
            if(Character.compare('o',a)==0)
                countofO=countofO+1;
            if(Character.compare('z',a)==0)
                countofZ=countofZ+1;
        }
        if(countofO == 2*countofZ)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
