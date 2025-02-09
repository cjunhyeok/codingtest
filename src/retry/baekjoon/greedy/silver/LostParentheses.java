package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LostParentheses {

    // 1541
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int sum = 0;
        boolean isFirstLoop = true;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            StringTokenizer value = new StringTokenizer(token, "+");

            int loopSum = 0;
            while (value.hasMoreTokens()) {
                int val = Integer.parseInt(value.nextToken());

                loopSum = loopSum + val;
            }

            if (isFirstLoop)  {
                sum = loopSum;
                isFirstLoop = false;
            } else {
                sum -= loopSum;
            }
        }

        System.out.println(sum);
    }
}
