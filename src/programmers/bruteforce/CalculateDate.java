package programmers.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculateDate {

    // 1476
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int EBound = 15;
        int SBound = 28;
        int MBound = 19;

        int EStart = 0;
        int SStart = 0;
        int MStart = 0;
        int result = 0;

        while (true) {

            EStart++;
            SStart++;
            MStart++;
            result++;

            if (EStart == EBound + 1) {
                EStart = 1;
            }
            if (SStart == SBound + 1) {
                SStart = 1;
            }

            if (MStart == MBound + 1) {
                MStart = 1;
            }

            if (E == EStart && S == SStart && M == MStart) {
                break;
            }
        }

        System.out.println(result);
    }
}
