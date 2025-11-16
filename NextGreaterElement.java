import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>(); 
        
        
        for (int num : nums2) {
            
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
      
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]); 
        }
        
        return ans;
    }

    public static void main(String[] args) {
    
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        
        int[] nums1_2 = {2,4};
        int[] nums2_2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1_2, nums2_2))); 
    }
}
