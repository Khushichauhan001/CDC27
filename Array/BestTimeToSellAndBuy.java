package Array;

public class BestTimeToSellAndBuy {
     public int maxProfit(int[] prices) {
        int n = prices.length ;
        int minSoFar = prices[0];
        int result = 0 ;
        for(int i=0 ; i< n ;i++){
            minSoFar = Math.min(minSoFar , prices[i]);
            result = Math.max(result , prices[i]-minSoFar);

        }
        return result ;
    
    }
}
