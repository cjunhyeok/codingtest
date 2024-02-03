package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {

    static int count = 0;
    static int compute, connect;
    static int[][] virus;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    // 2606
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        compute = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        virus = new int[compute + 1][compute + 1];
        visited = new boolean[compute + 1];
        StringTokenizer st;

        for (int i = 1; i <= connect; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            virus[first][second] = virus[second][first] = 1;
        }

        bfs(1);

        System.out.println(count);
    }

    private static void bfs(int start) {
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            for (int i = 1; i <= compute; i++) {
                if (virus[poll][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    count = count + 1;
                }
            }
        }
    }
}
