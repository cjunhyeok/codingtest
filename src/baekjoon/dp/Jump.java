package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jump {

    private static int N;
    private static int[][] jump;
    private static long[][] dp;

    // 1890
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        jump = new int[N][N];
        dp = new long[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                jump[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int nextValue = jump[i][j];

                if (nextValue == 0) {
                    break;
                }
                if (j + nextValue < N) {
                    dp[i][j + nextValue] += dp[i][j];
                }
                if (i + nextValue < N) {
                    dp[i + nextValue][j] += dp[i][j];
                }
            }
        }

        System.out.println(dp[N - 1][N - 1]);
    }
}
