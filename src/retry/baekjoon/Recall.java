package retry.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Recall {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        for (int i = 0; i < N; i++) {
            int I = Integer.parseInt(br.readLine());
            StringTokenizer studentNumber = new StringTokenizer(br.readLine());
            for (int j = 0; j < I; j++) {
                String number = studentNumber.nextToken();

                if (map.containsKey(number)) {
                    Integer count = map.get(number);
                    map.put(number, count + 1);
                } else {
                    map.put(number, 1);
                }
            }
        }

        int answer = 0;

        for (String key : map.keySet()) {
            Integer count = map.get(key);
            if (count >= M) {
                answer = answer + 1;
            }
        }

        System.out.println(answer);
    }
}
