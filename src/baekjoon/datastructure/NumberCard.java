package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard {

    // 10815
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        Map<Long, Boolean> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long val = Long.parseLong(st.nextToken());
            map.put(val, true);
        }

        long M = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Long val = Long.valueOf(st.nextToken());
            Boolean isHave = map.get(val);
            if (isHave != null) {
                if (i == M - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("1 ");
                }

            } else if (isHave == null){
                if (i == M - 1) {
                    System.out.print("0");
                } else {
                    System.out.print("0 ");
                }
            }
        }
    }
}
