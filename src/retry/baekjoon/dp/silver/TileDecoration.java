package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TileDecoration {

    // 13301
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Long x = 2L;
        Long y = 2L;
        Long[] dp = new Long[N + 1];
        dp[1] = x + y;

        for (int i = 2; i <= N; i++) {
            Long temp = x;
            x = x + y;
            y = temp;

            dp[i] = x + y;
        }

        System.out.println(dp[N]);
    }
}
