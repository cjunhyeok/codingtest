package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class NumberBoardJump {

    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static int[][] numbers;
    private static Set<String> sixNumber = new HashSet<>();
    private final static int N = 5;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numbers = new int[N][N];
        String[] str;
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                numbers[i][j] = Integer.parseInt(str[j]);

            }
        }
        String s = new String();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                dfs(i,j,0,s);
            }
        }
        System.out.println(sixNumber.size());
    }

    public static void dfs(int x, int y, int count, String s) {
        if(count==6){
            sixNumber.add(s);
            return;
        }

        for(int i = 0; i < 4; i++) {
            int nextX = dx[i]+x;
            int nextY = dy[i]+y;

            if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N){
                continue;
            }

            dfs(nextX, nextY, count+1, s + numbers[x][y]);
        }

    }
}
