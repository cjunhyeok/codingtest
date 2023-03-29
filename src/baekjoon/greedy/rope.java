package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rope {

    // 2217
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] weights = new Integer[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt(); // 10, 15
        }
        int max = weights[0];

        Arrays.sort(weights, Collections.reverseOrder());

        for (int i = 1; i < N; i++) {
            if ((weights[i] * (i + 1) > max)) {
                max = weights[i] * (i + 1);
            }
        }

        System.out.println(max);
    }
}
