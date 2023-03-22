package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoseBracket {

    // 1541
    public void greedy() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("-"); // 빼기 기준으로 분리
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            String[] pluses = arr[i].split("\\+");

            for (int j = 0; j < pluses.length; j++) {
                sum += Integer.parseInt(pluses[j]);
            }

            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
