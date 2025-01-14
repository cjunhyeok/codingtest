package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {

    // 2164
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int index = 1;
        while (true) {

            if (queue.size() == 1) {
                break;
            }

            if (index % 2 == 0) {
                Integer poll = queue.poll();
                queue.add(poll);
            } else {
                queue.poll();
            }

            index++;
        }

        System.out.println(queue.poll());
    }
}
