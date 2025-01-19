package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<Integer[]> queue = new LinkedList<>();
            Deque<Integer[]> deque = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int priority = Integer.parseInt(st.nextToken());

                Integer[] value = {j, priority};
                deque.add(value);
            }

            int maxPriority = 0;
            for (Integer[] integers : deque) {
                Integer priority = integers[1];

                if (priority > maxPriority) {
                    maxPriority = priority;
                }
            }

            while (!deque.isEmpty()) {
                Integer[] poll = deque.poll();
                if (poll[1] < maxPriority) {
                    deque.addLast(poll);
                } else if (poll[1] == maxPriority) {
                    queue.add(poll);

                    maxPriority = 0;
                    for (Integer[] integers : deque) {
                        Integer priority = integers[1];

                        if (priority > maxPriority) {
                            maxPriority = priority;
                        }
                    }
                }
            }

            int count = 1;
            while (!queue.isEmpty()) {
                Integer[] poll = queue.poll();
                if (poll[0] == M) {
                    System.out.println(count);
                } else {
                    count++;
                }
            }
        }
    }
}
