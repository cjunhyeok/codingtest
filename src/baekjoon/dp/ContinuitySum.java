package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuitySum {

    // 1912
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 10
        int[] sum = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            sum[i] = scanner.nextInt();
        }

        dp[0] = sum[0];

        for (int i = 1; i < N; i++) {
            if (dp[i - 1] + sum[i] >= sum[i]) {
                dp[i] = dp[i - 1] + sum[i];
            } else if (dp[i - 1] + sum[i] < sum[i]) {
                dp[i] = sum[i];
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
