package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCopy {

    // 2195
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        StringBuilder sb = new StringBuilder();
        int result = 0;
        Boolean isContain = true;

        for (int i = 0; i < P.length(); i++) {

            if (i == P.length() - 1) {
                result = result + 1;
                break;
            }

            char val = P.charAt(i);
            sb.append(val);

            char nextVal = P.charAt(i + 1);
            sb.append(nextVal);

            String value = sb.toString();

            if (i == P.length() - 2 && S.contains(value)) {
                isContain = true;
            } else if (i == P.length() - 2 && !S.contains(value)) {
                isContain = false;
            }

            if (!S.contains(value)) {
                result = result + 1;
                sb = new StringBuilder();
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        System.out.println(result);
    }
}
