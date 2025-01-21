package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TimeManagement {

    // 6068
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int T = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            arr[i][0] = T;
            arr[i][1] = S;
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        int cache = arr[0][1] - arr[0][0];
        int result = cache;

        for (int i = 1; i < N; i++) {
            int t = arr[i][1];
            int s = arr[i][0];

            int val = t - s;

            if (val < cache) {
                result = -1;
            } else {
                cache = val;
            }
        }

        System.out.println(result);
    }
}
