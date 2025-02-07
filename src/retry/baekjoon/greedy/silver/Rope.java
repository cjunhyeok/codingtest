package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rope {

    // 2217
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            list.add(value);
        }

        Collections.sort(list, Collections.reverseOrder());

        int max = 0;
        for (int i = 1; i <= list.size(); i++) {
            Integer value = list.get(i - 1);

            if (max < value * i) {
                max = value * i;
            }
        }

        System.out.println(max);
    }
}
