package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping {

    // 4796
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 1;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int count = V;
            int result = 0;

            while (true) {
                if (count > P) {
                    result = result + L;
                    count = count - P;
                } else {
                    if (count <= L) {
                        result = result + count;
                        count = 0;
                    } else {
                        result = result + L;
                        count = 0;
                    }
                }

                if (count == 0) {
                    break;
                }
            }

            System.out.println("Case " + i + ":" + " " + result);
            i++;
        }
    }

    public void otherSolution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 1;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int result = L * (V / P) + Math.min(L, V % P);

            System.out.println("Case " + i + ":" + " " + result);
            i++;
        }
    }
}
