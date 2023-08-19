package baekjoon.bfs;

import java.util.*;

public class AttachComplexNumber {

    // 2667

    private static int N;
    private static int[][] complex;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static boolean[][] visited;
    private static int totalComplex = 0;
    private static List<Integer> answer = new ArrayList<>();
    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        complex = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            for (int j = 0; j < N; j++) {
                complex[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i <N; i++) {
            for (int j = 0; j < N; j++) {
                if (complex[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                    totalComplex++;
                }
            }
        }

        System.out.println(totalComplex);
        Collections.sort(answer);
        for (Integer integer : answer) {
            System.out.println(integer);
        }
    }

    private static void bfs(int x, int y) {
        int count = 1;
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()) {
            int[] nowXY = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                int nextX = nowXY[0] + dx[i];
                int nextY = nowXY[1] + dy[i];

                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
                    if (complex[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        queue.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                        count++;
                    }
                }
            }
        }

        answer.add(count);
    }
}
