package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RepairMan {

    // 1449
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());   //배열크기
        int L = Integer.parseInt(st.nextToken());
        int[] value = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(value);

        int range = (int)(value[0] - 0.5 + L);
        int result = 1;

        for (int i = 1; i < value.length; i++) {
            if (range < (int)(value[i] + 0.5)) {
                range = (int)(value[i] - 0.5 + L);
                result = result + 1;
            }
        }

        System.out.println(result);
    }
}
