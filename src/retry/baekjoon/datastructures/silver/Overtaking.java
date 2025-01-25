package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Overtaking {

    // 2002
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(br.readLine(), i);
        }

        // 추월 차량 인덱스 저장
        int answer = 0;
        List<Integer> overtaking = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            String val = br.readLine();

            if (overtaking.isEmpty()) {
                Integer count = map.get(val);

                if (count != i) {
                    answer++;
                    overtaking.add(count);
                }
            } else {

                Integer count = map.get(val);
                int index = count;
                for (Integer over : overtaking) {
                    if (count < over) {
                        index++;
                    }
                }

                if (index != i) {
                    answer++;
                    overtaking.add(count);
                }
            }
        }

        System.out.println(answer);
    }
}
