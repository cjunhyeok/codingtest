package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronBar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Stack<Character> stack = new Stack<>();

        int result = 0;
        for (int i = 0; i < line.length(); i++) {
            char val = line.charAt(i);

            if (val == '(') {
                stack.push(val);
            } else {
                Character pop = stack.pop();

                if (line.charAt(i - 1) == '(') {
                    result = result + stack.size();
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
