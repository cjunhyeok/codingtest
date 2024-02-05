package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomenAssociationPresident {

    // 2775
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            int k = Integer.parseInt(br.readLine()); // 2
            int n = Integer.parseInt(br.readLine()); // 3

            int[][] apartment = new int[k + 1][n];

            for (int i = 1; i <= n; i++) {
                apartment[0][i - 1] = i;
            }

            for (int i = 1; i <= k; i++) {
                apartment[i][0] = 1;
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < n; j++) {
                    int count = 0;
                    for (int v = 0; v <= j; v++) {
                        count = count + apartment[i - 1][v];
                    }

                    apartment[i][j] = count;
                }
            }

            System.out.println(apartment[k][n - 1]);
        }
    }
}
