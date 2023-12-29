package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PolarTearBracket {

    // 25918
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String bracket = br.readLine();
        Stack<Character> stack = new Stack<>();
        Integer result = 0;

        for (int i = 0; i < N; i++) {
            char val = bracket.charAt(i);
            if (stack.isEmpty() || val == stack.peek()) {
                stack.push(val);
            } else {
                stack.pop();
            }

            result = Math.max(stack.size(), result);
        }

        if (stack.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
