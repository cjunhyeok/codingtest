package retry.baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        long val = A * B * C;
        String value = String.valueOf(val);

        for (int i = 0; i < 10; i++) {

            int count = 0;
            for (int j = 0; j < value.length(); j++) {
                char c = value.charAt(j);

                String integer = String.valueOf(i);
                String character = String.valueOf(c);

                if (integer.equals(character)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
