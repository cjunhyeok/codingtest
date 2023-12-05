package baekjoon.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Zero {

    // 10773
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Long> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
            Long val = scanner.nextLong();

            if (val == 0) {
                stack.pop();
            } else {
                stack.add(val);
            }
        }

        for (Long val : stack) {
            result += val;
        }
        System.out.println(result);
    }
}
