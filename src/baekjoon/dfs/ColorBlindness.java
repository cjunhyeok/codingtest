package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorBlindness {

    static int N;
    static char[][] values;
    static int[] dx = {1, 0, -1, 0}; // 우, 상, 좌, 하
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    // 10026
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        values = new char[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            String value = br.readLine();
            for (int j = 0; j < N; j++) {
                char val = value.charAt(j);
                values[i][j] = val;
            }
        }

        Integer count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    nonBlindness(i, j);
                    count++;
                }
            }
        }

        Integer result = 0;
        visited = new boolean[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    blindness(i, j);
                    result++;
                }
            }
        }

        System.out.print(count + " " + result);
    }

    public static void nonBlindness(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N) {
                if (!visited[cx][cy] && values[cx][cy] == values[x][y]) {
                    nonBlindness(cx, cy);
                }
            }
        }
    }

    public static void blindness(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N) {

                if (values[x][y] == 'R' || values[x][y] == 'G') {
                    if (!visited[cx][cy] && (values[cx][cy] == 'R' || values[cx][cy] == 'G')) {
                        blindness(cx, cy);
                    }
                } else if (values[x][y] == 'B') {
                    if (!visited[cx][cy] && values[cx][cy] == values[x][y]) {
                        blindness(cx, cy);
                    }
                }
            }
        }
    }
}
