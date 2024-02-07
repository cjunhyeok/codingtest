package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction {

    // 1003
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int val = Integer.parseInt(br.readLine());

            int[][] fibo = new int[val + 1][val + 1];

            if (val == 0) {
                System.out.println("1 0");
            } else if (val == 1) {
                System.out.println("0 1");
            } else {
                fibo[0][0] = 1; // 0
                fibo[1][0] = 0; // 1
                fibo[0][1] = 0;
                fibo[1][1] = 1;
                for (int i = 2; i <= val; i++) {
                    fibo[0][i] = fibo[0][i - 1] + fibo[0][i - 2];
                    fibo[1][i] = fibo[1][i - 1] + fibo[1][i - 2];
                }
                System.out.println(fibo[0][val] + " " + fibo[1][val]);
            }
        }
    }
}
