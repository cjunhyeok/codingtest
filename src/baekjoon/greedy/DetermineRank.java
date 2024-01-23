package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DetermineRank {

    // 2012
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N + 1];
        score[0] = 0;

        for (int i = 1; i <= N; i++) {
            int val = Integer.parseInt(br.readLine());
            score[i] = val;
        }

        Arrays.sort(score);

        Long result = 0L;
        for (int i = 1; i <= N; i++) {
            result = result + Math.abs(i - score[i]);
        }

        System.out.println(result);
    }
}
