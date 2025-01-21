package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BalloonPop {

    // 2346
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 5

        Deque<int[]> q = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 3, 2, 1, -3, -1
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int in = arr[0]; // 3

        for(int i=1; i<n; i++){
            q.add(new int[] {(i+1), arr[i]}); //(2, 2), (3, 1), (4, -3), (5, -1)
        }

        while(!q.isEmpty()) {
            if(in >0) {
                for(int i=1; i<in; i++) {
                    q.add(q.poll());
                }

                int[] nxt = q.poll();
                in = nxt[1];
                sb.append(nxt[0]+" ");
            }
            else {
                for(int i=1; i<-in; i++	) {
                    q.addFirst(q.pollLast());
                }

                int[] nxt = q.pollLast();
                in = nxt[1];
                sb.append(nxt[0]+" ");
            }
        }

        System.out.println(sb.toString());
    }
}
