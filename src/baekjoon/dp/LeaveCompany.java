package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeaveCompany {

    // 14501
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int T = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            if (i + T <= N + 1) {
                dp[i + T] = Math.max(P + dp[i], dp[i + T]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        System.out.println(dp[N + 1]);
    }
}
