package baekjoon.dp;

import java.util.Scanner;

public class RGBDistance {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;
    static int[][] cost;
    static int[][] DP;

    // 1149
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        cost = new int[N][3];
        DP = new int[N][3];

        for(int i = 0; i < N; i++) {
            cost[i][Red] = in.nextInt();
            cost[i][Green] = in.nextInt();
            cost[i][Blue] = in.nextInt();
        }

        // DP의 첫번째 값(집)은 각 색상비용의 첫번째 값으로 초기화
        DP[0][Red] = cost[0][Red];
        DP[0][Green] = cost[0][Green];
        DP[0][Blue] = cost[0][Blue];


        System.out.print(Math.min(dp(N- 1, Red), Math.min(dp(N - 1, Green), dp(N - 1, Blue))));
    }

    static int dp(int n, int color) {

        // 만약 탐색하지 않은 배열이라면
        if(DP[n][color] == 0) {

            // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
            if(color == Red) {
                DP[n][Red] = Math.min(dp(n - 1, Green), dp(n - 1, Blue)) + cost[n][Red];
            }
            else if(color == Green) {
                DP[n][Green] = Math.min(dp(n - 1, Red), dp(n - 1, Blue)) + cost[n][Green];
            }
            else {
                DP[n][Blue] = Math.min(dp(n - 1, Red), dp(n - 1, Green)) + cost[n][Blue];
            }
        }

        return DP[n][color];
    }
}
