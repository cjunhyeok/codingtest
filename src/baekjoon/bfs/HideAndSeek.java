package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {

    // 1697

    private static int N, K;
    private static int visited[] = new int[100010];
    private static int answer = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt(); // 5
        K = scanner.nextInt(); // 17

        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        int index = N;
        int n = 0;
        visited[index] = 1;
        while (!queue.isEmpty()) {
            n = queue.poll();

            if (n == K) {
                answer = visited[n] - 1;
                break;
            }
            if (n-1>=0 && visited[n-1] == 0)
            {
                visited[n-1] = visited[n]+1;
                queue.add(n-1);
            }
            if (n+1 <= 100000 && visited[n+1] == 0)
            {
                visited[n+1] = visited[n]+1;
                queue.add(n+1);
            }
            if (2*n <= 100000 && visited[2*n] == 0)
            {
                visited[2*n] = visited[n] + 1;
                queue.add(2*n);
            }
        }

        System.out.println(answer);
    }
}
