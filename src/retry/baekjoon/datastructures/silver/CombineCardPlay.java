package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CombineCardPlay {
    public static void main(String[] args) throws IOException {

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            priorityQueue.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < M; i++) {
            Long first = priorityQueue.poll();
            Long second = priorityQueue.poll();

            Long sum = first + second;

            priorityQueue.add(sum);
            priorityQueue.add(sum);
        }

        Long answer = 0L;
        while (!priorityQueue.isEmpty()) {
            answer = answer + priorityQueue.poll();
        }

        System.out.println(answer);
    }
}
