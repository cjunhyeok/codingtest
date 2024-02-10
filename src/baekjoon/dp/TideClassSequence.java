package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TideClassSequence {

    static Long[] sequence = new Long[101];

    // 9461
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        sequence[1] = 1L;
        sequence[2] = 1L;
        sequence[3] = 1L;
        sequence[4] = 2L;
        sequence[5] = 2L;


        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 6; i <= N; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 5];
            }

            System.out.println(sequence[N]);
        }
    }
}
