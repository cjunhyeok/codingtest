package baekjoon.dfs;

import java.util.*;

public class AvoidGarbage {

    private static int N, M, K, count;
    private static int[][] garbage;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static boolean[][] visited;
    private static List<Integer> answer = new ArrayList<>();

    // 1743
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt(); // 3
        M = scanner.nextInt(); // 4
        K = scanner.nextInt(); // 5

        garbage = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 0; i < K; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            garbage[x][y] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (garbage[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    count = 0;
                }
            }
        }

        System.out.println(answer.stream().min(Collections.reverseOrder()).get());
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX <= N && nextX > 0 && nextY <= M && nextY > 0) {
                if (garbage[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    dfs(nextX, nextY);
                }
            }
        }
        answer.add(count);
    }
}
