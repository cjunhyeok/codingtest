package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AToB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 0;
        while (true) {
            if (A == B) {
                break;
            }

            if (B % 2 != 0 && B % 10 != 1) {
                count = -1;
                break;
            }

            if (A > B) {
                count = -1;
                break;
            }

            if (B % 10 == 1) {
                B = (B - 1) / 10;
                count++;
                continue;
            }

            if (B % 2 == 0) {
                B = B / 2;
                count++;
                continue;
            }
        }

        if (count == -1) {
            System.out.println(count);
        } else {
            System.out.println(count + 1);
        }
    }
}
