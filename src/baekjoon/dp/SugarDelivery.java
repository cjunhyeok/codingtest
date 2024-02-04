package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {

    // 2839
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        while (N > 0) {

            if (N % 5 == 0) {
                result = result + N / 5;
                System.out.println(result);
                return;
            }
            if (N < 3) {
                System.out.println(-1);
                return;
            }

            N = N - 3;
            result = result + 1;
        }

        System.out.println(result);
    }
}
