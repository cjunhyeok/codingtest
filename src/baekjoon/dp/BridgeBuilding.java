package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BridgeBuilding {

    static int[][] val = new int[31][31];

    // 1010
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(combination(M, N));
        }
    }

    private static int combination(int n, int r) {
        if (val[n][r] > 0) {
            return val[n][r];
        } else if (n == r || r == 0) {
            return val[n][r] = 1;
        } else {
            return val[n][r] =
                    combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
}
