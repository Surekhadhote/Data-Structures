class Solution{
    static boolean check_duck(String N){
        char ch = N.charAt(0);
        if(ch == '0')
        return false;
        else{
        HashSet<Character> h = new HashSet<Character>(N.length());
        for(int i=1;i<N.length();i++){
           h.add(N.charAt(i));
           if(h.contains('0')){
           return true;
           }
        }
     }
     return false;
   }
}
