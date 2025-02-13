package retry.baekjoon.dfs.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus {

    static int[][] virus;
    static boolean[] visited;
    static int computer, connect, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        virus = new int[computer + 1][computer + 1];
        visited = new boolean[computer + 1];

        for (int i = 0; i < connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            virus[A][B] = virus[B][A] = 1;
        }

        count = 0;
        dfs(1);

        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        visited[start] = true;
        count++;

        for (int i = 0; i <= computer; i++) {
            if (virus[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
