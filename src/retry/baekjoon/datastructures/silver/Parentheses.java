package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Boolean> stack = new Stack<>();
        boolean isNo = false;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);

                if (c == '(') {
                    stack.push(true);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isNo = true;
                        break;
                    }
                }
            }

            if (isNo) {
                System.out.println("NO");
            }
            else if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack = new Stack<>();
            isNo = false;
        }
    }
}
