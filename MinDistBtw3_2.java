public class MinDistBtw3_2 {
     public int minimumDistance(int[] nums) {
        int n = nums.length ;
        int minD = Integer.MAX_VALUE ;
        int maxDist =0;
        int y = -1 ;
        boolean found = false;
        for(int i=0;i< n;i++){
            for(int j=i+1 ;j<n;j++){
                for(int k=j+1 ;k <n ;k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        found = true ;
                        int dist = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        minD = Math.min(minD , dist);
                        maxDist++;
                    }
                }
            }
        }
        return found ? minD : -1 ;
    }
}
