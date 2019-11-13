package ninechapter.dp.sequence;

/**
 * <h1></h1>
 * Created by Kaizuidebanli.
 */
public class MaxProfit1 {

    /**
     * 最多只允许完成一次股票交易
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 1)
            return 0;
        int result = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++){
            result = Math.max(result, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return result;
    }
}
