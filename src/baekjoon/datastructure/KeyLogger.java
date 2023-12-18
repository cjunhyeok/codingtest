package baekjoon.datastructure;

import java.io.*;
import java.util.Stack;

public class KeyLogger {

    // 5397
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 2

        for (int t = 0; t < N; t++) {
            StringBuilder sb = new StringBuilder();
            String val = br.readLine();
            Stack<Character> pass = new Stack<>();
            Stack<Character> passBuffer = new Stack<>();

            for (int i = 0; i < val.length(); i++) {
                char key = val.charAt(i);
                if (key == '<') {
                    if (!pass.isEmpty()) {
                        Character pop = pass.pop();
                        passBuffer.push(pop);
                    }
                } else if (key == '>') {
                    if (!passBuffer.isEmpty()) {
                        Character poll = passBuffer.pop();
                        pass.push(poll);
                    }
                } else if (key == '-') {
                    if (!pass.isEmpty()) {
                        pass.pop();
                    }
                } else {
                    pass.push(key);
                }
            }

            while (!pass.isEmpty()) {
                passBuffer.push(pass.pop());
            }
            while (!passBuffer.isEmpty()) {
                sb.append(passBuffer.pop());
            }

            bw.write(sb.toString());
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
