package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CardCoalescencePlay {

    // 15903
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 4
        int M = Integer.parseInt(st.nextToken()); // 2

        st = new StringTokenizer(br.readLine(), " ");
        Queue<Long> cards = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            Long val = Long.parseLong(st.nextToken());
            cards.add(val); // 4, 2, 3, 1
        }

        for (int i = 0; i < M; i++) {
            Long zero = cards.poll();
            Long first = cards.poll();

            Long sum = zero + first;
            cards.offer(sum);
            cards.offer(sum);
        }

        Long result = 0L;
        for (Long card : cards) {
            result = result + card;
        }

        System.out.println(result);
    }
}
