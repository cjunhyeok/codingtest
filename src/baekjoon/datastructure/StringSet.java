package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringSet {

    // 14425
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<String> sets = new HashSet<>();
        Integer count = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String val = br.readLine();
            sets.add(val);
        }

        for (int i = 0; i < M; i++) {
            String val = br.readLine();

            if (sets.contains(val)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
