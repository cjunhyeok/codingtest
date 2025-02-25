package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadovanSequence {

    // 9461
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            Long[] dp = new Long[101];
            dp[1] = 1L;
            dp[2] = 1L;
            dp[3] = 1L;
            dp[4] = 2L;
            dp[5] = 2L;

            if (N < 6) {
                System.out.println(dp[N]);
                continue;
            }

            for (int i = 6; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 5];
            }

            System.out.println(dp[N]);
        }
    }
}
