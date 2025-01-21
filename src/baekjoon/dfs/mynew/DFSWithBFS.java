package baekjoon.dfs.mynew;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSWithBFS {

    private static int dfs[][];
    private static boolean visited[];
    private static int N, M, V;
    private StringBuilder sb = new StringBuilder();
    private Queue<Integer> queue = new LinkedList<>();

    public void dfs() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt(); // 정점 4
        M = scanner.nextInt(); // 간선 5
        V = scanner.nextInt(); // 시작 1

        dfs = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for(int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            dfs[a][b] = dfs[b][a] = 1;
        }

        dfsMethod(V);

        sb.append("/n");
        visited = new boolean[N + 1];

        bfsMethod(V);

        System.out.println(sb);
    }

    private void dfsMethod(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for (int i = 0; i < M; i++) {
            if (dfs[start][i] == 1 && !visited[start]) {
                dfsMethod(i);
            }
        }
    }

    private void bfsMethod(int start) {
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start + " ");

            for (int i = 1; i <= N; i++) {
                if (dfs[start][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
