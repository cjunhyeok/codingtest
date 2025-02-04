package retry.baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JosephusProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {

            for (int i = 0; i < K - 1; i++) {
                Integer poll = queue.poll();
                queue.offer(poll);
            }

            if (!queue.isEmpty()) {
                Integer poll = queue.poll();
                list.add(poll);
            }
        }

        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + ">");
            } else {
                System.out.print(list.get(i) +  ", ");
            }
        }
    }
}
