package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigPerson {

    // 7568
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] values = new int[2][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            values[0][i] = x;
            values[1][i] = y;
        }

        for (int i = 0; i < N; i++) {

            int result = 0;
            int currentX = values[0][i];
            int currentY = values[1][i];
            for (int j = 0; j < N; j++) {
                if (currentX < values[0][j] && currentY < values[1][j]) {
                    result += 1;
                }
            }
            if (i == N - 1) {
                System.out.println(result + 1);
            } else {
                System.out.print((result + 1) + " ");
            }
        }
    }
}
