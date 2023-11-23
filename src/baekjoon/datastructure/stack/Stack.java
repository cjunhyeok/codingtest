package baekjoon.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {

    // 10828
    public static void main(String[] args) throws IOException {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String prompt = st.nextToken();
            if (prompt.equals("push")) {
                int number = Integer.parseInt(st.nextToken());

                stack.push(number);
            } else if (prompt.equals("top")) {
                try {
                    System.out.println(stack.peek());
                } catch (Exception e) {
                    System.out.println(-1);
                }
            } else if (prompt.equals("empty")) {
                if (stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (prompt.equals("size")) {
                System.out.println(stack.size());
            } else if (prompt.equals("pop")) {
                try {
                    System.out.println(stack.pop());
                } catch (Exception e) {
                    System.out.println(-1);
                }
            }
        }
    }
}
