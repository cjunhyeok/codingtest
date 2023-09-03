package baekjoon.dp;

import java.util.Scanner;

public class Sticker {

    // 9465
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = scanner.nextInt();
        int N;
        int[][] dp;
        int[][] sticker;

        for (int t = 0; t < T; t++) {
            N = scanner.nextInt();
            sticker = new int[2][N + 1];
            dp = new int[2][N + 1];

            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= N; j++) {
                    sticker[i][j] = scanner.nextInt();
                }
            }

            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for(int i = 2; i <= N; i++){
                dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + sticker[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + sticker[1][i];
            }

            int max = Math.max(dp[0][N], dp[1][N]);
            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}
