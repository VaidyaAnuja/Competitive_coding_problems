//See problem statement from below link
//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numinput = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        String[] output = new String[numinput];
        String flag ="No";
        for(int i=0; i<numinput; i++){
            if(i!=numinput-1 && input[i].equals(input[i+1]) && input[i].equals("H"))
            {
                flag="No";
                break;
            }
            else{
                flag="Yes";
                if(input[i].equals(".")){
                    output[i]="B";
                }
                else{
                    output[i]="H";
                }
            }
        }
        if(flag.equals("Yes")){
            System.out.println("YES");
            String finaloutput="";
            for(int j=0; j<numinput; j++){
                finaloutput = finaloutput + output[j];
            }
            System.out.println(finaloutput);
        }
        else if(flag.equals("No")){
            System.out.println("NO");
        }

    }
}
