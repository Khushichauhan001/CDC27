import java.util.HashSet;

public class KeepMultiplying {
       public int findFinalValue(int[] nums, int original) {
       HashSet<Integer> h1 = new HashSet<>();
       for(int x : nums) h1.add(x);

       while(h1.contains(original)){
        original *= 2;
       }
       return original ;
    }
}
