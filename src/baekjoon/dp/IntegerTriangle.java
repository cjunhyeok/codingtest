package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntegerTriangle {

    // 1932
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N + 1][N + 1];
        int[][] triangleCache = new int[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j <= i; j++) {
                int val = Integer.parseInt(st.nextToken());
                triangle[i][j] = val;
            }
        }

        triangleCache[0][0] = triangle[0][0];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j - 1) >= 0 && (j + 1) <= i) {
                    triangleCache[i][j] = Math.max(triangleCache[i - 1][j - 1], triangleCache[i - 1][j]) + triangle[i][j];
                } else if (j == 0){
                    triangleCache[i][j] = triangleCache[i - 1][j] + triangle[i][j];
                } else if (j == i) {
                    triangleCache[i][j] = triangleCache[i - 1][j - 1] + triangle[i][j];
                }
            }
        }

        int max = Arrays.stream(triangleCache[N - 1]).max().getAsInt();
        System.out.println(max);
    }
}
