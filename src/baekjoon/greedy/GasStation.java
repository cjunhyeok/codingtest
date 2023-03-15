package baekjoon.greedy;

import java.util.Scanner;

public class GasStation {

    // 13305
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] dist = new long[N - 1];
        long[] cost = new long[N];

        for (int i = 0; i < N - 1; i++) {
            dist[i] = scanner.nextLong();
        }
        for (int i = 0; i < N; i++) {
            cost[i] = scanner.nextLong();
        }

        long sum = 0;
        long minCost = cost[0];

        for (int i = 0; i < N - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }

        System.out.println(sum);
    }
}
