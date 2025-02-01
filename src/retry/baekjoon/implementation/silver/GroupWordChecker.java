package retry.baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GroupWordChecker {

    // 1316
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int t = 0; t < N; t++) {
            String line = br.readLine();
            Map<Character, Boolean> map = new HashMap<>();

            for (int i = 0; i < line.length(); i++) {
                char value = line.charAt(i);

                if (map.containsKey(value)) {
                    Boolean isBefore = map.get(value);

                    if (!isBefore && line.charAt(i - 1) != value) {
                        map.put(value, true);
                    }
                } else {
                    map.put(value, false);
                }
            }

            boolean isGroup = true;
            for (Boolean value : map.values()) {
                if (value) {
                    isGroup = false;
                    break;
                }
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}
