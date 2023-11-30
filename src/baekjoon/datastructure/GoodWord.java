package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class GoodWord {

    // 3986
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            st = new StringTokenizer(br.readLine(), " ");
            String token = st.nextToken();

            stack.add(token.charAt(0));

            for (int j = 1; j < token.length(); j++) {
                if (stack.empty()) {
                    stack.push(token.charAt(j));
                }
                else if (token.charAt(j) == 'A' && stack.peek() == 'A') {
                    stack.pop();
                } else if (token.charAt(j) == 'B' && stack.peek() == 'B') {
                    stack.pop();
                } else {
                    stack.push(token.charAt(j));
                }
            }

            if (stack.empty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
