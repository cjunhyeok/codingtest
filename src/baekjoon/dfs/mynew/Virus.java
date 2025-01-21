package baekjoon.dfs.mynew;

import java.util.Scanner;

public class Virus {

    private static int N;
    private static int M;
    private static int count = 0;
    private static int[][] dfs;
    private static boolean[] visited;
    private static final int START = 1;

    public void dfs() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt(); // 7
        M = scanner.nextInt(); // 6

        dfs = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            dfs[a][b] = dfs[b][a] = 1;
        }

        dfsMethod(START);

        System.out.println(count);
    }

    public static void dfsMethod(int start) {
        visited[start] = true;

        for (int i = 1; i < N + 1; i++) {
            if (dfs[start][i] == 1 && !visited[i]) {
                count++;
                dfsMethod(i);
            }
        }
    }
}
