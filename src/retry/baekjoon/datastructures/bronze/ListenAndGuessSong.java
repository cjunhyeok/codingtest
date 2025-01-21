package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ListenAndGuessSong {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());

            String song = st.nextToken();
            String one = st.nextToken();
            String two = st.nextToken();
            String three = st.nextToken();
            String syllableName = one + two + three;

            if (map.containsKey(syllableName)) {
                map.put(syllableName, "?");
            } else {
                map.put(syllableName, song);
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String one = st.nextToken();
            String two = st.nextToken();
            String three = st.nextToken();
            String syllableName = one + two + three;

            if (map.containsKey(syllableName)) {
                System.out.println(map.get(syllableName));
            } else {
                System.out.println("!");
            }
        }
    }
}
