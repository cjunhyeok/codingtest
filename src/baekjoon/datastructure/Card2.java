package baekjoon.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

    // 2164
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            Integer top = queue.remove();
            queue.add(top);
        }

        System.out.println(queue.poll());
    }
}
