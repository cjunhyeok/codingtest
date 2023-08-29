package baekjoon.dp;

import java.util.Scanner;

public class SpecialBinaryNumber {

    // 2193
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 3
        long[] dp = new long[N + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);
    }
}
