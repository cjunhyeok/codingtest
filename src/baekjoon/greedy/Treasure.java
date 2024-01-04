package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Treasure {

    // 1026
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> a = new PriorityQueue<>();
        Queue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            a.offer(val);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            b.offer(val);
        }

        Integer sum = 0;
        for (int i = 0; i < N; i++) {
            Integer aPoll = a.poll();
            Integer bPoll = b.poll();

            sum = sum + aPoll * bPoll;
        }

        System.out.println(sum);
    }
}
