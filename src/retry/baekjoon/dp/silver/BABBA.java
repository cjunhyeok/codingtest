package retry.baekjoon.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BABBA {

    // 9625
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();
        int[] value = new int[2];

        value[0] = 1;
        value[1] = 0;
        list.add(value);

        for (int i = 1; i <= N; i++) {
            int[] lastValue = list.get(i - 1);
            int[] val = new int[2];
            val[0] = lastValue[1];
            val[1] = lastValue[0] + lastValue[1];

            list.add(val);
        }

        int[] answer = list.get(N);
        System.out.println(answer[0] + " " + answer[1]);
    }
}
