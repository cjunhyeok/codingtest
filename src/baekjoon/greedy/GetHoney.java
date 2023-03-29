package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GetHoney {

    // 21758
    public void greedy() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] honey = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(st.nextToken());
            honey[i] = a;
        }

        long cnt = 0;

        // 벌 왼쪽 고정, 꿀통 오른쪽 고정
        long fixBeeSum = Arrays.stream(honey).sum() - honey[0];
        long moveBeeSum = fixBeeSum;

        for (int i = 1; i <= honey.length - 2; i++) {
            long sum = fixBeeSum - honey[i];
            moveBeeSum = moveBeeSum - honey[i];
            sum += moveBeeSum;
            cnt = Math.max(sum, cnt);
        }

        // 벌 오른쪽 고정, 꿀통 왼쪽 고정
        fixBeeSum = fixBeeSum + honey[0] - honey[honey.length - 1];
        moveBeeSum = fixBeeSum;
        for (int i = honey.length - 2; i >= 0; i--) {
            long sum = fixBeeSum - honey[i];
            moveBeeSum = moveBeeSum - honey[i];
            sum += moveBeeSum - honey[i];
            cnt = Math.max(sum, cnt);
        }

        // 벌 양쪽 고정, 꿀통 움직임
        fixBeeSum = 0;
        moveBeeSum = Arrays.stream(honey).sum() - honey[honey.length - 1];
        for (int i = 1; i < honey.length - 2; i++) {
            long sum = 0;
            fixBeeSum += honey[i];
            moveBeeSum = moveBeeSum - honey[i - 1];
            cnt = Math.max(fixBeeSum + moveBeeSum, cnt);
        }

        System.out.println(cnt);
    }
}
