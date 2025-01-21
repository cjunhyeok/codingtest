package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SliceString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer Nst = new StringTokenizer(br.readLine());
        Set<String> separators = new HashSet<>();
        while (Nst.hasMoreTokens()) {
            separators.add(Nst.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer Mst = new StringTokenizer(br.readLine());
        while (Mst.hasMoreTokens()) {
            separators.add(Mst.nextToken());
        }

        int K = Integer.parseInt(br.readLine());
        StringTokenizer Kst = new StringTokenizer(br.readLine());
        Set<String> mergers = new HashSet<>();
        while (Kst.hasMoreTokens()) {
            mergers.add(Kst.nextToken());
        }

        separators.removeAll(mergers);

        int S = Integer.parseInt(br.readLine());
        String line = br.readLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder token = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            String currentChar = String.valueOf(line.charAt(i));

            if (separators.contains(currentChar) || currentChar.equals(" ")) {
                if (token.length() > 0) {
                    sb.append(token).append("\n");
                    token.setLength(0);
                }
            } else {
                token.append(currentChar);
            }
        }

        if (token.length() > 0) {
            sb.append(token).append("\n");
        }

        System.out.print(sb.toString());
    }
}
