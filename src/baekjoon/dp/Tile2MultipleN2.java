package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile2MultipleN2 {

    // 11727
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[1001];
        int N = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 3;

        if (N <= 2) {
            System.out.println(dp[N]);
        } else {
            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
            }

            System.out.println(dp[N]);
        }
    }
}
