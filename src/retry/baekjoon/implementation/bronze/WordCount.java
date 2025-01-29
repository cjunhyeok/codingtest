package retry.baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {

    // 1152
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());
    }

    public static void mySolution(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        if (line.equals(" ")) {
            System.out.println(0);
        } else {
            boolean isBeforeBlank = false;
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char val = line.charAt(i);

                if (val == ' ') {
                    if (i == 0 || i == (line.length() - 1)) {
                        continue;
                    } else if (isBeforeBlank) {
                        continue;
                    } else if (!isBeforeBlank) {
                        count++;
                        isBeforeBlank = true;
                    }
                } else {
                    isBeforeBlank = false;
                }
            }

            System.out.println(count + 1);
        }
    }
}
