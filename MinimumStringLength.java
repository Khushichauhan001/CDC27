public class MinimumStringLength {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        int count =0;
        String str = s ;
        int cA=0;
        int cB=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i) == 'a' && s.charAt(i-1) == 'b'){
                count+= 2;
            }
            else if(s.charAt(i) == 'b' && s.charAt(i-1) == 'a'){
                count+=2;
            }
        }
       for(char ch: s.toCharArray()){
           if(ch == 'a') cA++;
           else cB++;
       }
        return Math.abs(cA - cB);
    }
}
