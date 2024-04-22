package programmers.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneNumber {

    // 1065
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count++;
            } else if (i < 1000) {
                // 210
                int first = i % 10;
                int second = (i % 100) / 10;
                int third = i / 100;

                int firstMinus = (third - second);
                int secondMinus = (second - first);

                if (firstMinus == secondMinus) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
