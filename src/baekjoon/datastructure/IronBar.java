package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronBar {

    // 10799
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        Stack<Character> bracket = new Stack<>();
        Integer result = 0;

        for (int i = 0; i < val.length(); i++) {

            if (val.charAt(i) == '(') {
                bracket.push('(');
            } else {
                bracket.pop();

                if (val.charAt(i - 1) == '(') {
                    result += bracket.size();
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
