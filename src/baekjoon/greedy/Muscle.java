package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Muscle {

    //20300
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Long[] muscles = new Long[N - 1];
        Long answer = 0L;

        for (int i = 0; i < N; i++) {
            muscles[i] = scanner.nextLong();
        }
        Arrays.sort(muscles);

        if (muscles.length % 2 == 0) {
            for (int i = 0, j = N - 1; i < N && j >= 0; i++, j--) {
                if (answer < muscles[i] + muscles[j]) {
                    answer = muscles[i] + muscles[j];
                }
            }
        } else {
            answer = muscles[N - 1];
            for (int i = 0, j = N - 2; i < N && j >= 0; i++, j--) {
                if (answer < muscles[i] + muscles[j]) {
                    answer = muscles[i] + muscles[j];
                }
            }
        }

        System.out.println(answer);
    }
}
