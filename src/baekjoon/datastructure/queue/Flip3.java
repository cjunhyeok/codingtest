package baekjoon.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flip3 {

    // 1464
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String start = S.substring(0, 1);


        for (int i = 1; i < S.length(); i++) {

            if (start.charAt(i - 1) < S.charAt(i)) {
                start = S.charAt(i) + start;
            } else {
                start = start + S.charAt(i);
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            System.out.print(start.charAt(i));
        }
    }
}
