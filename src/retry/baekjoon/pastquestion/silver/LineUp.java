package retry.baekjoon.pastquestion.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LineUp {

    // 10431
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            int test = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 20; i++) {
                int val = Integer.parseInt(st.nextToken());
                list.add(val);
            }

            int count = 0;
            for (int i = 19; i >= 0; i--) {
                Integer last = list.get(i);
                for (int j = 0; j < i; j++) {
                    Integer val = list.get(j);

                    if (val > last) {
                        count++;
                    }
                }
            }

            System.out.println(test + " " + count);
        }
    }
}
