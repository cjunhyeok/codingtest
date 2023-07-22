package baekjoon.exhaustivesearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FloorDecoration {

    // 1388
    public void exhaustiveSearch() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] floor = new char[N + 1][M + 1];
        int cnt = 0;
        int i, j;

        for(i=0; i<N; i++) {

            String a = br.readLine();

            for(j=0; j<M; j++) {

                floor[i][j] = a.charAt(j);

            }
        }

        for(i=0; i<N; i++){
            for(j=0; j<M; j++){

                if(floor[i][j] == '-'){
                    if(floor[i][j+1] == '|' || j == M-1){
                        // 다음 칸(j+1)이 '|' 이거나
                        // 같은 행의 마지막 방인 겨우
                        cnt++;
                    }
                }

                if(floor[i][j] == '|'){
                    if(floor[i+1][j] == '-' || i == N-1){
                        // 다음 줄(i+1)이 '-' 이거나
                        // 같은 열의 마지막 방인 경우
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
