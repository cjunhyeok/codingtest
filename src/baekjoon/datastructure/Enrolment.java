package baekjoon.datastructure;

import java.io.*;
import java.util.*;

public class Enrolment {

    // 13414
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<String> codes = new LinkedHashSet<>();

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int i = 0; i < L; i++) {
            String val = br.readLine();
            if (codes.contains(val)) {
                codes.remove(val);
            }
            codes.add(val);
        }

        int count = 0;
        for (String code : codes) {

            if (count < K) {
                System.out.println(code);
            }
            count++;
        }
    }
}
