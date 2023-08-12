package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DegreeCalculate {

    private static int N, M;
    private static int compare[] = new int[2];
    private static List<Integer>[] degree;
    private static boolean visited[];
    private static Integer answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 9
        degree = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            degree[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            compare[i] = Integer.parseInt(st.nextToken()); // 7, 3
        }

        M = Integer.parseInt(br.readLine()); // 7

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            degree[x].add(y);
            degree[y].add(x);
        }

        dfsMethod(compare[0], compare[1], 0);

        System.out.println(answer);
    }

    private static void dfsMethod(int start, int end, int count) {
        if (start == end) {
            answer = count;
            return;
        }

        visited[start] = true;

        for (int i = 0; i < degree[start].size(); i++) {
            int next = degree[start].get(i);
            if (!visited[next]) {
                dfsMethod(next, end, count + 1);
            }
        }
    }
}