package retry.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            char value = line.charAt(i);

            if (value == 'L') {
                count++;
            }
        }

        if (count > 0) {
            count = count / 2;
        }

        if (count > 1) {
            N = N - count + 1;
        }

        System.out.println(N);
    }
}
