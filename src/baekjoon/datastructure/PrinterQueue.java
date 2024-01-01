package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {

    // 1966
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 3

        for (int i = 0; i < T; i++) {
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> indexQueue = new LinkedList<>();
            int count = 1;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 4 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 2 문서가 면번째 위치인지

            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());
                queue.offer(val);
                indexQueue.offer(j);
            }

            while (!queue.isEmpty()) {
                int max = Collections.max(queue); // 현재 최우선 문서
                int cur = queue.poll(); // 현재 문서
                int curIndex = indexQueue.poll(); // 현재 인덱스

                // 인쇄 가능할 때
                if(cur == max) {
                    // 찾는 문서를 인쇄했다면 몇번 째 인쇄인지 출력, break
                    if(curIndex == M) {
                        System.out.println(count);
                        break;
                    }
                    count++; // 인쇄할때마다 값 증가
                }
                // 인쇄 불가능하면 다시 맨 뒤에 넣어줌
                else {
                    queue.offer(cur);
                    indexQueue.offer(curIndex);
                }
            }
        }
    }
}
