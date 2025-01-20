package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FindNumber {

    public static void main(String[] args) throws IOException {

        Map<Long, Boolean> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            long A = Long.parseLong(st.nextToken());
            map.put(A, true);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            long val = Long.parseLong(st.nextToken());
            if (map.containsKey(val)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
