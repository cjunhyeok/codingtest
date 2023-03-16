package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sale {

    // 11508
    public void greedy() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] costs = new Integer[N];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            costs[i] = scanner.nextInt();
        }

        Arrays.sort(costs, Collections.reverseOrder());

        int j = 1;
        for (int i = 0; i < N; i++) {
            if (j % 3 == 0) {
                j++;
                continue;
            }
            answer = answer + costs[i];
        }

    }
}
