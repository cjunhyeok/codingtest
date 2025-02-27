package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoUpStair {

    // 2579
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[301];
        int[] stairs = new int[301];

        for (int i = 1; i <= N; i++) {
            int val = Integer.parseInt(br.readLine());
            stairs[i] = val;
        }

        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];
        dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max((stairs[i - 1] + dp[i - 3]), dp[i - 2]) + stairs[i];
        }

        System.out.println(dp[N]);
    }
}
