import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {
      List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0 , new ArrayList<>());
        return result ;
    }
    private void backtrack(String s , int start , List<String> paths){
        if(paths.size() == 4){
            if(start == s.length()){
                result.add(String.join(".", paths));
            }
           return ;
        }
        for(int len = 1; len <=3;len++){
            if(start+len > s.length()) break;
            String seg = s.substring(start , start+len);

            if(isValid(seg)){
                paths.add(seg);
                backtrack(s , start+len , paths);
                paths.remove(paths.size()-1);
            }    
        }
    }
    private boolean isValid(String s){
        if(s.length() > 1 && s.charAt(0) == '0' ) return false ;
        int num = Integer.parseInt(s);
        return num>=0 && num <= 255;
    }
}
