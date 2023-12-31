package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class JavaCasting {

    private static Map<String, ArrayList<String>> edges;

    // 25601
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        edges = new HashMap<>();
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if (!edges.containsKey(a)) {
                edges.put(a, new ArrayList<>());
            }
            edges.get(a).add(b);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        System.out.println(bf(a, b) || bf(b, a) ? 1 : 0);
    }

    private static boolean bf(String cur, String ed) {
        if (cur.equals(ed)) {
            return true;
        }
        if (edges.get(cur) == null)
            return false;
        for (String next : edges.get(cur)) {
            if (bf(next, ed))
                return true;
        }
        return false;
    }
}
