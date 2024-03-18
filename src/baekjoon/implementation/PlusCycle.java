package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlusCycle {

    // 1110
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 26

        List<Integer> values = new ArrayList<>();
        values.add(N);
        while (true) {
            N = (N % 10 * 10) + ((N / 10 + N % 10) % 10);

            if (values.contains(N)) {
                break;
            } else {
                values.add(N);
            }
        }

        System.out.println(values.size());
    }
}
