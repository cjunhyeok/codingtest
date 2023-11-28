package baekjoon.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bracket {

    // 9012
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        java.util.Stack<Character> stack;
        boolean isFalse = false;

        for (int i = 0; i < N; i++) {
            stack = new java.util.Stack();
            st = new StringTokenizer(br.readLine(), " ");
            isFalse = false;

            String token = st.nextToken();
            for (int j = 0; j < token.length(); j++) {
                if (token.charAt(j) == '(') {
                    stack.add(token.charAt(j));
                } else if (token.charAt(j) == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isFalse = true;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty() && isFalse == false) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
