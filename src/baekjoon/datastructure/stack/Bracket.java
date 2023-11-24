package baekjoon.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bracket {

    // 9012
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), "");
            stack = new Stack<>();
            boolean isNo = false;

            String vps = st.nextToken();
            for (int j = 0; j <= vps.length() - 1; j++) {

                if (vps.charAt(j) == '(') {
                    stack.add(1);
                } else if (vps.charAt(j) == ')') {
                    if (stack.empty()) {
                        isNo = true;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.empty() && isNo == false) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
