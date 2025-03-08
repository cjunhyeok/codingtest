package retry.baekjoon.datastructures.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSorting {

    // 1715
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        Long answer = 0L;

        for (int i = 0; i < N; i++) {
            Long val = Long.parseLong(br.readLine());
            priorityQueue.add(val);
        }

        while (priorityQueue.size() > 1) {
            Long poll = priorityQueue.poll();
            Long secondPoll = priorityQueue.poll();

            long sum = poll + secondPoll;
            answer = answer + (sum);
            priorityQueue.add(sum);
        }

        System.out.println(answer);
    }
}
