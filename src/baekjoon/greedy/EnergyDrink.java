package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EnergyDrink {

    //20115
    public void greedy() {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 5
        Double[] drinks = new Double[N];

        for (int i = 0; i < N; i++) {
            drinks[i] = scanner.nextDouble(); // 3, 2, 10, 9, 6
        }
        Arrays.sort(drinks, Collections.reverseOrder()); // 10, 9, 6, 3, 2

        Double answer = drinks[0];
        for (int i = N - 1; i >= 1; i--) {
            answer = answer + drinks[i] / 2;
        }

        System.out.println(answer);
    }
}
