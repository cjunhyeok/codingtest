package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Truck {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            queue.add(val);
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < W; i++) {
            bridge.add(0);
        }

        int time = 0;
        int sum = 0;
        while (!bridge.isEmpty()) {
            time++;
            sum = sum - bridge.poll();

            if (queue.isEmpty()) {
                continue;
            }

            if (sum + queue.peek() <= L) {
                Integer poll = queue.poll();
                bridge.add(poll);
                sum = sum + poll;
            } else {
                bridge.add(0);
            }
        }

        System.out.println(time);
    }
}
