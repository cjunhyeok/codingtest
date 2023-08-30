package baekjoon.dp;

import java.util.Scanner;

public class Tile01 {

    // 1904
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] dp = new long[N + 1];

        if (N == 1) {
            System.out.println(1);
            return;
        } else if (N == 2) {
            System.out.println(2);
            return;
        }

        dp[1] = 1;
        dp[2] = 2;

        for (int i  = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        System.out.println(dp[N]);
    }
}
