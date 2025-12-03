class AggressiveCows{
    public int aggressiveCows(int[] stalls, int k) {
        java.util.Arrays.sort(stalls);

        int left = 0;  
        int right = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlace(stalls, k, mid)) {
                ans = mid;      
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
    private boolean canPlace(int[] stalls, int k, int dist) {
        int count = 1;  
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
                if (count == k) return true; 
            }
        }

        return false;
    }
}