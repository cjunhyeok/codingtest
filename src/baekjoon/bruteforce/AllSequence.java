package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllSequence {

    static int N;
    static boolean[] visited;
    static int[] value;
    static StringBuilder sb = new StringBuilder();

    // 10974
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        value = new int[N];

        tracking(0);

        System.out.println(sb.toString());
    }

    private static void tracking(int index) {
        if (index == N) {
            for (int val : value) {
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                value[index] = i + 1;
                tracking(index + 1);
                visited[i] = false;
            }
        }
    }
}
