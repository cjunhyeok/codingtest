package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpKingJelly {

    // 16173
    private static int[][] map;
    private static boolean check = false;
    private static int n;

    public void dfs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0,n);

        if(check) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    public static void dfs(int x, int y, int last) {
        if(map[x][y] == 0) return;

        if(map[x][y] == -1){
            check = true;
            return;
        }

        // 아래
        if(x + map[x][y] >= 0 && x + map[x][y] < last)
            dfs(x + map[x][y], y,  last);

        // 오른족
        if(y + map[x][y] >= 0 && y + map[x][y] < last)
            dfs(x, y + map[x][y], last);
    }
}
