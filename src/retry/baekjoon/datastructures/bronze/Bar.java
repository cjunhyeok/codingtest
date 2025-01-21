package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());
            stack.push(h);
        }

        int maxHeight = 0;
        int count = 0;

        while (!stack.isEmpty()) {
            Integer currentH = stack.pop();
            if (currentH > maxHeight) {
                count++;
                maxHeight = currentH;
            }
        }

        System.out.println(count);
    }
}
