package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CyberOpeningGeneralMeeting {

    // 19583
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String S = st.nextToken(); // 22:00
        String E = st.nextToken(); // 23:00
        String Q = st.nextToken(); // 23:30

        String val;
        Set<String> startUser = new HashSet<>();
        Set<String> endUser = new HashSet<>();

        while ((val = br.readLine()) != null) {
            st = new StringTokenizer(val, " ");
            String time = st.nextToken();
            String name = st.nextToken();

            if (time.compareTo(S) <= 0) {
                startUser.add(name);
            } else if (time.compareTo(E) >= 0 && time.compareTo(Q) <= 0) {
                endUser.add(name);
            }

        }

        Integer count = 0;
        for (String s : startUser) {
            if (endUser.contains(s)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
