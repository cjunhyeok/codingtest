package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minkyeom {

    // 21314
    // push했지만 이해 못함
    public void greedy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        StringBuilder max = new StringBuilder("");
        StringBuilder min = new StringBuilder("");

        int start = 0;
        int target = 0;
        while(start < input.length()) {
            target = input.indexOf('K', start);
            if(target != -1) {
                int M_length = target - start;
                max.append(5);
                for(int i=0; i<M_length; i++) max.append(0);
                start = target + 1;
            }
            else {
                int M_length = input.length() - start;
                for(int i=0; i<M_length; i++) max.append(1);
                break;
            }
        }

        start = 0;
        target = 0;
        while(start < input.length()) {
            target = input.indexOf('K', start);
            if(target != -1) {
                int M_length = target - start;
                if(M_length > 0) {
                    min.append(1);
                    for(int i=0; i<M_length-1; i++) min.append(0);
                };
                min.append(5);
                start = target + 1;
            }
            else {
                int M_length = input.length() - start;
                min.append(1);
                for(int i=0; i<M_length-1; i++) min.append(0);
                break;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
