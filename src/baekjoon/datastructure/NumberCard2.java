package baekjoon.datastructure;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard2 {

    // 10816
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());

            if (map.containsKey(val)) {
                Integer count = map.get(val);
                map.put(val, ++count);
            } else {
                map.put(val, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int val = Integer.parseInt(st.nextToken());

            if (map.containsKey(val)) {
                Integer count = map.get(val);
                sb.append(count);
            } else {
                sb.append(0);
            }

            if (i == M - 1) {

            } else {
                sb.append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
