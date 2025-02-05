package retry.baekjoon.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Diff5And6 {

    // 2864
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        String maxA = A.replaceAll("5", "6");
        String maxB = B.replaceAll("5", "6");

        String minA = A.replaceAll("6", "5");
        String minB = B.replaceAll("6", "5");

        System.out.print((Integer.parseInt(minA) + Integer.parseInt(minB)) + " " + (Integer.parseInt(maxA) + Integer.parseInt(maxB)));
    }
}
