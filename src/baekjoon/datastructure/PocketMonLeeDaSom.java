package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PocketMonLeeDaSom {

    // 1620
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> pocketMons = new HashMap<>();
        Map<String, Integer> pocketMonsNum = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String pocketMon = st.nextToken();

            pocketMons.put(i, pocketMon);
            pocketMonsNum.put(pocketMon, i);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String token = st.nextToken();
            try {
                int key = Integer.parseInt(token);
                System.out.println(pocketMons.get(key));
            } catch (Exception e) {
                System.out.println(pocketMonsNum.get(token));
            }
        }
    }
}
