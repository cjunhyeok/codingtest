package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NoDuplicates {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Boolean> map = new HashMap<>();
        boolean isCorrect = false;

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            if (map.containsKey(word)) {
                isCorrect = true;
            } else {
                map.put(word, true);
            }
        }

        if (isCorrect) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
