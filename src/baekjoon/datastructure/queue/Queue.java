package baekjoon.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue {

    // 10845
    public static void main(String[] args) throws IOException {
        java.util.Queue<Integer> queue = new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String prompt = st.nextToken();
            Integer val = 0;

            if (prompt.equals("push")) {
                val = Integer.parseInt(st.nextToken());
                queue.offer(val);
            } else if (prompt.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {

                    System.out.println(queue.poll());
                }
            } else if (prompt.equals("size")) {
                System.out.println(queue.size());
            } else if (prompt.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (prompt.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            } else if (prompt.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(val);
                }
            }
        }
    }
}
