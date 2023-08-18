package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PermutationCycle {

    // 10451

    private static int T, N;
    private static int[][] map;
    private static int[] permutation, ordinal;
    private static boolean[] visited;
    private static boolean flag = true;
    private static Queue<Integer> queue;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine()); // 2

        for (int i = 0; i < T; i++)
        {
            count = 0;
            queue = new LinkedList<>();
            N = Integer.parseInt(br.readLine()); // 8

            ordinal = new int[N + 1];
            permutation = new int[N + 1];
            map = new int[N + 1][N + 1];
            visited = new boolean[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j < N + 1; j++) {
                ordinal[j] = j; // 1, 2, 3, 4, 5, 6, 7, 8
                permutation[j] = Integer.parseInt(st.nextToken()); // 3, 2, 7, 8, 1, 4, 5, 6

                map[ordinal[j]][permutation[j]] = 1;
                map[permutation[j]][ordinal[j]] = 1;
            }

            for (int j = 1; j <= N; j++) {
                if (visited[j] == false) {
                    bfs(j);
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int start) {
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (map[poll][i] != 0 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
