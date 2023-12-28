package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class AlienGuitarPlay {

    // 2841
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer>[] stack = new Stack[7];

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(st.nextToken());
        Integer P = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 0; i < 7; i++) {
            stack[i] = new Stack<Integer>();
        }

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());

            Integer line = Integer.parseInt(st.nextToken());
            Integer fret = Integer.parseInt(st.nextToken());

            while(!stack[line].isEmpty() && stack[line].peek() > fret ){
                stack[line].pop();
                count++;
            }

            if (stack[line].isEmpty() || stack[line].peek() < fret) {
                stack[line].push(fret);
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
