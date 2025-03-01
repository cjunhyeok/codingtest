package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBDistance {

    // 1149
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] value = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            value[i][0] = r;
            value[i][1] = g;
            value[i][2] = b;
        }

        dp[0][0] = value[0][0];
        dp[0][1] = value[0][1];
        dp[0][2] = value[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = value[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = value[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = value[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        int firstMin = Math.min(dp[N - 1][0], dp[N - 1][1]);
        System.out.println(Math.min(firstMin, dp[N - 1][2]));
    }
}
