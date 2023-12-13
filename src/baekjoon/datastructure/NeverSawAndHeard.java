package baekjoon.datastructure;

import java.io.*;
import java.util.*;

public class NeverSawAndHeard {

    // 1764
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> result = new ArrayList<>();

        Set<String> strings = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String neverSaw = br.readLine();
            strings.add(neverSaw);
        }

        for (int i = 0; i < M; i++) {
            String neverHeard = br.readLine();

            if (strings.contains(neverHeard)) {
                result.add(neverHeard);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (String string : result) {
            System.out.println(string);
        }
    }
}
