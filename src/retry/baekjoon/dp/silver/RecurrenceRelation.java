package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurrenceRelation {

    // 13699
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] dp = new Long[N + 1 + 3];

        dp[0] = 1L;
        dp[1] = 1L;
        dp[2] = 2L;
        dp[3] = 5L;

        for (int i = 4; i <= N; i++) {

            Long sum = 0L;
            int k = i - 1;

            for (int j = 0; j < i; j++) {
                long part = dp[j] * dp[k];
                sum = sum + part;
                k--;
            }
            dp[i]  = sum;
        }

        System.out.println(dp[N]);
    }
}
