import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {

     String s = "" + S.charAt(0);
	    for(int i=1;i<S.length();i++){
	        char ch = S.charAt(i);
	        if(ch == ' ')
	        s = s + S.charAt(i+1);
	    }
	    return s;
    }
};
