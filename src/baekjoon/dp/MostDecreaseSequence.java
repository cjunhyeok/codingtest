package baekjoon.dp;

import java.util.Scanner;

public class MostDecreaseSequence {

    // 11722

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            dp[i] = 1; // 각 요소 자체가 길이 1인 부분 수열로 시작
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1; // 이전 부분 수열 길이 + 1
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }

        System.out.println(maxLen);
    }
}
