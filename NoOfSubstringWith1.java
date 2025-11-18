public class NoOfSubstringWith1 {
     public int numSub(String s) {
        long count =0;
        long curr =0;
        long mod = 1000000007;
        for(char c:s.toCharArray()){
            if(c == '1'){
                curr++;
                count = (curr+count) % mod ;
            }
            else{
                curr =0;
            }
        }

 return (int) count ;
    }
}





// Example: "111"
// i=0: "1"
// i=1: "1", "11"
// i=2: "1", "11", "111"


// Total:

// 1 + 2 + 3 = 6


// This is exactly equal to
// n*(n+1)/2










// class Solution {
//     public int numSub(String s) {
//         long mod = 1000000007;
//         long ans = 0;
//         long len = 0;   // length of current continuous 1s block
        
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '1') {
//                 len++;  // increase block length
//             } else {
//                 // Block ended → apply formula
//                 ans = (ans + (len * (len + 1) / 2)) % mod;
//                 len = 0;
//             }
//         }

//         // After loop ends, last block may still exist
//         ans = (ans + (len * (len + 1) / 2)) % mod;

//         return (int) ans;
//     }
// }
