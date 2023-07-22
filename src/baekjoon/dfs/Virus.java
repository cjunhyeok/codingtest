package baekjoon.dfs;

import java.util.Scanner;

public class Virus {

    // 2606
    static int[][] virus = null;
    static boolean visited[] = null;
    static int count = 0;
    static final int START = 1;

    public void dfs() {

        Scanner scanner = new Scanner(System.in);
        int compute = scanner.nextInt();
        int connect = scanner.nextInt();

        virus = new int[compute + 1][compute + 1];
        visited = new boolean[compute + 1];

        for (int i = 0; i < connect; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            virus[a][b] = virus[b][a] = 1;
        }

        dfsMethod(START, compute);

        System.out.println(count);
        scanner.close();
    }

    static void dfsMethod(int start, int compute) {
        visited[start] = true;

        for (int i = 0; i <= compute; i++) {
            if (virus[start][i] == 1 && !visited[i]) {
                count++;
                dfsMethod(i, compute);
            }
        }
    }
}
