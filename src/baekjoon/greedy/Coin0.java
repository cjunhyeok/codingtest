package baekjoon.greedy;

import java.util.Scanner;

public class Coin0 {

    // 11047
    public void greedy() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 10
        int K = scanner.nextInt(); // 4200
        int[] coins = new int[N];

        int answer = 0;

        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt(); // 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000
        }

        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                answer += K / coins[i];
                K = K % coins[i];
            }
        }
        System.out.println(answer);
    }
}
