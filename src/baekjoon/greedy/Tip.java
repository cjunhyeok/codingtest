package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tip {
    // 1758

    public void greedy() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Long[] tips = new Long[N];
        int[] minus = new int[N];
        Long answer = 0L;

        for (int i = 0; i < N; i++) {
            tips[i] = scanner.nextLong();
        }
        Arrays.sort(tips, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            if ((tips[i] - minus[i]) >= 0) {
                answer = answer + (tips[i] - minus[i]);
            }
        }

        System.out.println(answer);
    }
}
