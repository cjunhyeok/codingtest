package retry.baekjoon.datastructures.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NGE {

    // 17298
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] numbers = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                numbers[stack.pop()] = numbers[i];
            }

            stack.add(i);
        }

        while (!stack.isEmpty()) {
            numbers[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(numbers[i]).append(" ");
        }

        System.out.println(sb);
    }
}
