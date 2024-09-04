class Solution {
    public int maxProfit(int[] prices) {
       int l=0;
       int r=1;
       int profit;
       int maxProfit=0;
       while(r<prices.length){
        profit=prices[r]-prices[l];
        
       if(prices[r]<prices[l]) {l=r; }

        else {
            maxProfit= Math.max(maxProfit, profit);
            r++;
        }
        
       }
       return maxProfit;

    }
}