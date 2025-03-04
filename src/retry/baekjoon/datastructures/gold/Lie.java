package retry.baekjoon.datastructures.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Lie {

    static int N, M;
    static boolean[] visited;
    static int[][] lie;
    static List<Integer> lier = new ArrayList<>();
    static List<Integer>[] lists;

    // 1043
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lie = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        lists = new List[M];

        st = new StringTokenizer(br.readLine());
        int lierCount = Integer.parseInt(st.nextToken());
        for (int i = 0; i < lierCount; i++) {
            int val = Integer.parseInt(st.nextToken());
            lier.add(val);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int party = Integer.parseInt(st.nextToken());

            List<Integer> participants = new ArrayList<>();

            for (int j = 0; j < party; j++) {
                participants.add(Integer.parseInt(st.nextToken()));
            }

            if (participants.size() > 1) {
                for (int k = 0; k < participants.size() - 1; k++) {
                    Integer x = participants.get(k);
                    Integer y = participants.get(k + 1);
                    lie[x][y] = lie[y][x] = 1;
                }
            }

            lists[i] = participants;
        }

        for (Integer integer : lier) {
            dfs(integer);
        }

        List<Integer> lieParticipant = new ArrayList<>();
        for (int i = 1; i < visited.length; i++) {
            if (visited[i]) {
                lieParticipant.add(i);
            }
        }

        int count = 0;
        for (List<Integer> list : lists) {
            boolean isLie = false;
            for (Integer integer : list) {
                if (lieParticipant.contains(integer)) {
                    isLie = true;
                }
            }

            if (!isLie) {
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i <= N; i++) {
            if (lie[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
