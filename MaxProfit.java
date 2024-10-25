class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
       for(int i=0; i<prices.length; i++){
        if(prices[i]<minprice){
            minprice = prices[i];
        }
        else{
            int profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit,profit);
        }
       } 
       return maxprofit;
    }
}

public class MaxProfit {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; //we prices bounce 1--5 where profit is 4 that's max profit 
        Solution obj = new Solution();
        System.out.println(obj.maxProfit(prices));
    }
}

