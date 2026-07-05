class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = i+1;;
        int maxprofit = 0;
        while(j < prices.length){
            maxprofit = Math.max(maxprofit,prices[j]-prices[i]);
            if(prices[i] > prices[j]) i = j;
            else j++;
        }
        return maxprofit;
    }
}
