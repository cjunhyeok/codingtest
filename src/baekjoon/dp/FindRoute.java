package baekjoon.dp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FindRoute {

    private static int N;
    private static int[][] map;
    private static int[][] answer;

    // 11403
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt(); // 3
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][i] == 1 && map[i][k] == 1) {
                        map[j][k] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
