package ninechapter.dp.sequence;

/**
 * <h1>买卖股票的最佳时机 III : 最多可以完成两笔交易</h1>
 * Created by Kaizuidebanli.
 */
public class MaxProfit3 {

    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 1){
            return 0;
        }
        int n = prices.length;
        int[][] dp = new int[n + 1][5 + 1];
        // 初始化, 第0天，第一阶段的最大收益
        dp[0][1] = 0;
        // 第0天，其余阶段的收益初始化为负无穷
        for(int i = 2; i <=5; i++){
            dp[0][i] = Integer.MIN_VALUE;
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 5; j += 2){
                // 1, 3, 5
                dp[i][j] = dp[i-1][j];  // 阶段保持，前一天就是在1,3,5阶段
                if(j > 1 && i > 1 && dp[i-1][j - 1]!= Integer.MIN_VALUE){
                    // 前一天处在前一阶段，今天卖出
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j - 1] + prices[i-1] - prices[i-2]);
                }
            }
            // 2, 4
            for(int j = 2; j <= 5; j += 2){
                // 前一天处在前一个阶段，今天买入，收益不变同前一天的前一个阶段
                dp[i][j] = dp[i-1][j-1];
                if(i > 1 && dp[i-1][j] != Integer.MIN_VALUE){
                    // 前一天就处在当前阶段，今天继续持有股票并获利
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + prices[i-1]- prices[i-2]);
                }

            }
        }
        return Math.max(dp[n][0], Math.max(dp[n][3], dp[n][5]));
    }
}
