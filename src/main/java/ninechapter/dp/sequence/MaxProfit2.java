package ninechapter.dp.sequence;

/**
 * <h1></h1>
 * Created by Kaizuidebanli.
 */
public class MaxProfit2 {

    /**
     * 可以买卖任意多次股票
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1){
            return 0;
        }

        int res = 0;
        for (int i = 0; i < prices.length-1; i++){
            if(prices[i + 1] > prices[i]){
                res += prices[i+1] - prices[i];
            }
        }
        return res;
    }
}
