class Solution {
    public static int get(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(i+1 < s.length() && (get(s.charAt(i)) < get(s.charAt(i+1))))
                res = res - get(s.charAt(i));
            else 
                res = res + get(s.charAt(i));
        }
        return res;
    }
}
