package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceCycle {

    static int[] arr;
    static boolean[] visited;
    static int N;
    static int result;

    // 10451
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            visited = new boolean[N + 1];
            result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 1; i <= N; i++){
                int val = Integer.parseInt(st.nextToken());

                arr[i] = val;
            }

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    dfs(i);

                    result = result + 1;
                }
            }

            System.out.println(result);
        }
    }

    public static void dfs(Integer start) {
        visited[start] = true;

        int next = arr[start];

        if (!visited[next]) {
            dfs(arr[start]);
        }
    }
}
