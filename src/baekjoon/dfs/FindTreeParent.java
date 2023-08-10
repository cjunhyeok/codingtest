package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindTreeParent {

    // 11725

    private static final int START = 1;
    private static List<List<Integer>> edges = new ArrayList<>();
    private static boolean[] visited;
    private static int[] parents;
    private static int nodes;

    public void dfs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nodes = Integer.parseInt(br.readLine());

        for (int i = 0; i <= nodes; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < nodes - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            edges.get(node1).add(node2);
            edges.get(node2).add(node1);
        }

        visited = new boolean[nodes + 1];
        parents = new int[nodes + 1];

        dfsMethod(START);

        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }

    private void dfsMethod(int start) {
        visited[start] = true;

        for (int v : edges.get(start)) {
            if (!visited[v]) {
                dfsMethod(v);
                parents[v] = start;
            }
        }
    }
}
