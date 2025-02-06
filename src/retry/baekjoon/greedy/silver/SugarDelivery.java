package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while (true) {
            if (N < 3) {
                break;
            }

            if (N % 5 != 0) {
                N = N - 3;
                count++;
            } else {
                N = N / 5;
                count = count + N;
                N = 0;
            }
        }

        if (N > 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
