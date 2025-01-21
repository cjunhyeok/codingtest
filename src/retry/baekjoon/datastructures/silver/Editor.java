package retry.baekjoon.datastructures.silver;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor {

    public static void main(String[] args) throws IOException {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            char val = line.charAt(i);
            left.push(val);
        }


        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("P")) {
                String value = st.nextToken();
                char val = value.charAt(0);

                left.push(val);
            } else if (command.equals("L")) {
                if (!left.isEmpty()) {
                    Character pop = left.pop();
                    right.push(pop);
                }
            } else if (command.equals("D")) {
                if (!right.isEmpty()) {
                    Character pop = right.pop();
                    left.push(pop);
                }
            } else if (command.equals("B")) {
                if (!left.isEmpty()) {
                    left.pop();
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Character character : left) {
            bw.write(character);
        }

        while (!right.isEmpty()) {
            bw.write(right.pop());
        }

        bw.flush();
        bw.close();
    }
}
