package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileOrganize {

    // 20291
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> files = new HashMap<>();
        List<String> keys = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            String extract = st.nextToken();

            if (files.containsKey(extract)) {
                Integer val = files.get(extract);
                files.put(extract, val + 1);
            } else {
                files.put(extract, 1);
                keys.add(extract);
            }
        }

        Collections.sort(keys);

        for (String key : keys) {
            System.out.println(key + " " + files.get(key));
        }
    }
}
