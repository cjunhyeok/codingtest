package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CongressElection {

    // 1417
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(0);
            System.exit(0);
        }
        int result = 0;
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            int val = Integer.parseInt(br.readLine());
            queue.offer(val);
        }

        while (true) {
            Integer maxValue = queue.poll();

            if (maxValue >= dasom) {
                maxValue = maxValue - 1;
                dasom = dasom + 1;
                result = result + 1;
            } else {
                break;
            }

            queue.offer(maxValue);
        }

        System.out.println(result);
    }
}
