package baekjoon.dp;

import java.util.Scanner;

public class Hello {

    // 1535
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] stamina = new int[N];
        int[] pleasure = new int[N];
        int[] dp = new int[100];

        for (int i = 0; i < N; i++) {
            stamina[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            pleasure[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 99; j >= stamina[i]; j--) {
                dp[j] = Math.max(dp[j - stamina[i]] + pleasure[i], dp[j]);
            }
        }

        System.out.println(dp[99]);
    }
}
