package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CardPlace {

    // 18115
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
        for (int i = 1; i <= N; i++) {
            int val = Integer.parseInt(st.nextToken());

            if (val == 1) {
                deque.offerFirst(i);
            } else if (val == 2) {
                Integer first = deque.removeFirst();
                deque.addFirst(i);
                deque.addFirst(first);
            } else if (val == 3) {
                deque.offerLast(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (deque.size() != 0) {
            sb.append(deque.removeFirst() + " ");
        }
        System.out.println(sb);
    }
}
