package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {

    public void greedy() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] waits = new Integer[N];
        Integer[] count = new Integer[N];
        for (int i = 0; i < N; i++) {
            waits[i] = scanner.nextInt();
        }

        Arrays.sort(waits);
        count[0] = waits[0];
        for (int i = 1; i < N; i++) {
            count[i] = waits[i] + count[i - 1];
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = answer + count[i];
        }

        System.out.println(answer);
    }
}
