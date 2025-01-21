package baekjoon.dfs.mynew;

import java.util.Scanner;

public class JumpKingJelly {

    private static int N;
    private static int[][] map;
    private static boolean check;

    public void dfs() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt(); // 3

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        dfsMethod(0, 0);

        if(check) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    private void dfsMethod(int x, int y) {
        if (map[x][y] == -1) {
            check = true;
            return;
        }

        if (x + map[x][y] < N) {
            dfsMethod(x + map[x][y], y);
        }

        if (y + map[x][y] < N) {
            dfsMethod(x, y + map[x][y]);
        }
    }
}
