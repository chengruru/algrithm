package ninechapter.dp.coordinate;

import java.util.Arrays;

/**
 * <h1>俄罗斯套娃信封</h1>
 * Created by Kaizuidebanli.
 */
public class MaxEnvelopes {

    /*
        给一定数量的信封，带有整数对 (w, h) 分别代表信封宽度和高度。一个信封的宽高均大于另一个信封时可以放下另一个信封。
        求最大的信封嵌套层数。
     * @param envelopes: a number of envelopes with widths and heights
     * @return: the maximum number of envelopes
     */
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length < 1 || envelopes[0] == null || envelopes[0].length < 1)
            return 0;
        Arrays.sort(envelopes, (envelope1, envelope2) -> {
            if(envelope1[0] == envelope2[0])
                return envelope1[1] - envelope2[1];
            else
                return envelope1[0] - envelope2[0];
        });
        int n = envelopes.length, max = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(envelopes[j][0] < envelopes[i][0] &&
                        envelopes[j][1] < envelopes[i][1])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
