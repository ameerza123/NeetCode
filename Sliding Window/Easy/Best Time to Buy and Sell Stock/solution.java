public class solution {
    public int maxProfit(int[] prices) {

        int maxP = 0;

        for (int sellDay = 1; sellDay < prices.length; sellDay++) { // sellDay loops forward through list

            for (int buyDay = sellDay-1; buyDay >= 0; buyDay--) { // buyDay loops backwards from sellDay
                
                if (prices[sellDay] - prices[buyDay] >= maxP) {
                    maxP = prices[sellDay] - prices[buyDay];
                }
            }
        }

        return maxP;
    }
}
