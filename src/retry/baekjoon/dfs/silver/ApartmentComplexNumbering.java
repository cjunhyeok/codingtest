package retry.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartmentComplexNumbering {

    static int[][] apartment;
    static boolean[][] visited;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static int apartments, N;
    static List<Integer> counts = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        apartment = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                char value = line.charAt(j);
                if (value == '0') {
                    apartment[i][j] = 0;
                } else {
                    apartment[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (!visited[i][j] && apartment[i][j] == 1) {
                    apartments = 0;
                    dfsMethod(i, j);
                    counts.add(apartments);
                }
            }
        }

        Collections.sort(counts);

        System.out.println(counts.size());
        for (Integer count : counts) {
            System.out.println(count);
        }
    }

    private static void dfsMethod(int x, int y) {
        visited[x][y] = true;
        apartments++;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N)
            if (!visited[cx][cy] && apartment[cx][cy] == 1) {
                dfsMethod(cx, cy);
            }
        }
    }
}
