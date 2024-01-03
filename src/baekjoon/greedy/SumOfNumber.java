package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber {

    // 1789
    public static void myLogicError() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        Long count = 1L;
        Long sum = 0L;
        Long result = 0L;
        Boolean flag = true;

        while (flag) {
            sum = 0L;
            for (int i = 0; i < count; i++) {
                sum = sum + i;

                if (sum > S) {
                    result = Integer.toUnsignedLong(i - 1);
                    flag = false;
                    break;
                } else if (sum == S) {
                    result = Integer.toUnsignedLong(i);
                    flag = false;
                    break;
                }
            }
            count = count + 1;
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        Long count = 0L;
        Long sum = 0L;
        Long i = 1L;

        while (true) {
            if (sum > S) {
                break;
            }
            sum = sum + i;
            count = count + 1;
            i = i + 1;
        }

        System.out.println(count - 1);
    }
}
