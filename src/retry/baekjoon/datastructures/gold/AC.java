package retry.baekjoon.datastructures.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class AC {

    // 5430
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String p = br.readLine();

            Deque<Integer> deque = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());

            String x = br.readLine();
            String[] split = x.split(",");
            for (int i = 0; i < n; i++) {
                String replace = split[i].replaceAll("\\[", "").replaceAll("]", "");
                int val = Integer.parseInt(replace);

                deque.add(val);
            }

            boolean isLeft = true;
            boolean isError = false;
            for (int i = 0; i < p.length(); i++) {
                char function = p.charAt(i);

                if (function == 'R') {
                    isLeft = !isLeft;
                } else if (function == 'D') {

                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }

                    if (isLeft) {
                        deque.pollFirst();
                    } else {
                        deque.pollLast();
                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                System.out.print("[");

                if (isLeft) {
                    int size = deque.size();
                    for (int i = 0; i < size; i++) {
                        if (i == size - 1) {
                            Integer poll = deque.pollFirst();
                            System.out.print(poll);
                        } else {
                            Integer poll = deque.pollFirst();
                            System.out.print(poll + ",");
                        }
                    }
                } else {
                    int size = deque.size();
                    for (int i = 0; i < size; i++) {
                        if (i == size - 1) {
                            Integer poll = deque.pollLast();
                            System.out.print(poll);
                        } else {
                            Integer poll = deque.pollLast();
                            System.out.print(poll + ",");
                        }
                    }
                }

                System.out.println("]");
            }
        }
    }
}
