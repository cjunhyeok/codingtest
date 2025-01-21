package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Laboratory {

    private static int N;
    private static int M;
    private static int[][] laboratory;
    private static int[] dx = new int[]{1, 0, -1, 0};
    private static int[] dy = new int[]{0, 1, 0, -1};
    static int maxSafeZone = Integer.MIN_VALUE; //최대값을 찾기 위한 최소값 설정

    // 14502
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        laboratory = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                laboratory[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        dfs(0);
    }

//    private static void dfs(Integer index) {
//        //벽이 3개가 설치 된 경우 bfs 탐색 시작
//        if(index == 3) {
//            bfs();
//            return;
//        }
//
//        for(int i=0; i<N; i++) {
//            for(int j=0; j<M; j++) {
//                if(laboratory[i][j] == 0) {
//                    laboratory[i][j] = 1;
//                    dfs(index+1);
//                    laboratory[i][j] = 0;
//                }
//            }
//        }
//    }
}
