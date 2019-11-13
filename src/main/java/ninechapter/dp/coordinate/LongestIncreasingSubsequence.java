package ninechapter.dp.coordinate;

/**
 * <h1>最长上升子序列</h1>
 * Created by Kaizuidebanli.
 */
public class LongestIncreasingSubsequence {

    /**
     * 给定一个整数序列，找到最长上升子序列（LIS），返回LIS的长度。
     * @param nums: An integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        if(nums == null || nums.length < 1)
            return 0;

        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            max = Math.max(max, dp[i]);
        return max;

    }
}
