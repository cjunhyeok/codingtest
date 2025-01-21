package programmers.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiffMax {

    public static int N;
    public static int[] value;
    public static int[] answer;
    public static boolean[] visited;
    public static int result;

    // 10819
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        value = new int[N];
        answer = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            value[i] = val;
        }

        dfs(0);

        System.out.println(result);
    }

    public static void dfs (int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(answer[i] - answer[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                answer[depth] = value[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
