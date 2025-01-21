package retry.baekjoon.datastructures.silver;

import java.io.*;
import java.util.Stack;

public class KeyLogger {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < T; t++) {
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            String line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                char val = line.charAt(i);

                if (val == '<') {
                    if (!left.isEmpty()) {
                        Character pop = left.pop();
                        right.push(pop);
                    }
                } else if (val == '>') {
                    if (!right.isEmpty()) {
                        Character pop = right.pop();
                        left.push(pop);
                    }
                } else if (val == '-') {
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                } else {
                    left.push(val);
                }
            }

            for (Character character : left) {
                bw.write(character);
            }

            int size = right.size();
            for (int i = 0; i < size; i++) {
                bw.write(right.pop());
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
