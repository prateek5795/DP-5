//  Time Complexity: O(mn)
//  Space Complexity: O(n)

import java.util.*;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = m-2; i >= 0; --i) {
            for (int j = n-2; j >= 0; --j) {
                dp[j] = dp[j+1] + dp[j];
            }
        }

        return dp[0];
    }
}
