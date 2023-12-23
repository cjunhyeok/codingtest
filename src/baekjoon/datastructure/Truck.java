package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Truck {

    // 13335
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 4
        int W = Integer.parseInt(st.nextToken()); // 2
        int L = Integer.parseInt(st.nextToken()); // 10
        int count = 0;
        int sum = 0;

        Queue<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            while (true) {
                if (queue.isEmpty()) {
                    if (val > L) {
                        break;
                    }
                    queue.add(val);
                    sum = sum + val;
                    count = count + 1;
                    break;
                } else if (queue.size() == W){
                    sum = sum - queue.poll();
                } else {
                    if (sum + val <= L) {
                        queue.add(val);
                        sum = sum + val;
                        count = count + 1;
                        break;
                    } else {
                        queue.add(0);
                        count = count + 1;
                    }
                }
            }
        }

        System.out.println(count + W);
    }
}
