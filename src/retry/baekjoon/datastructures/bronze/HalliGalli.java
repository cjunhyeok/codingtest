package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HalliGalli {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> fruits = new HashMap();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            if (fruits.containsKey(fruit)) {
                Integer currentCount = fruits.get(fruit);
                fruits.put(fruit, currentCount + count);
            } else {
                fruits.put(fruit, count);
            }
        }

        boolean isYes = false;
        for (String fruit : fruits.keySet()) {
            Integer count = fruits.get(fruit);

            if (count == 5) {
                isYes = true;
            }
        }

        if (isYes) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
