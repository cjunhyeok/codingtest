package programmers.stack;

import java.util.*;

public class CorrectBracket {

    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            Character val = s.charAt(i);

            if (val.equals('(')) {
                stack.push(val);
            } else if (val.equals(')')) {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
