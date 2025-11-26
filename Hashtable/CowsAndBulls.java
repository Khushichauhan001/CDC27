package Hashtable;

public class CowsAndBulls {
    public String getHint(String secret, String guess) {
        int bulls = 0 ;
        int cows =0 ;
        int[] s = new int[10];
        int[] g = new int[10];

        for(int i=0 ;i<secret.length() ;i++){
            char ch = secret.charAt(i);
            char gc = guess.charAt(i);

            if(ch == gc) bulls++ ;
            else {
                s[ch - '0']++;
                g[gc - '0']++;
            }
        }
        for(int d=0 ;d <10 ;d++){
            cows += Math.min(g[d], s[d]);
        }
        return bulls+"A"+ cows+ "B";
    }
}
