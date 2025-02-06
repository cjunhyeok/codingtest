package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            list.add(value);
        }

        Collections.sort(list);

        int sum = 0;
        List<Integer> answer = new ArrayList<>();
        for (Integer value : list) {
            sum = sum + value;
            answer.add(sum);
        }

        sum = 0;
        for (Integer value : answer) {
            sum = sum + value;
        }

        System.out.println(sum);
    }
}
