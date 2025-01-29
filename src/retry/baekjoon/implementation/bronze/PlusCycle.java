package retry.baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

    // 1110
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        int count = 0;
        int currentValue = value;

        while (true) {

            int ten = currentValue / 10; // 2
            int one = currentValue % 10; // 6

            currentValue = (one * 10) + ((ten + one) % 10);
            count++;

            if (currentValue == value) {
                break;
            }
        }

        System.out.println(count);
    }
}
