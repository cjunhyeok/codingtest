package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LectureRoom {

    // 11000
    public void greedy() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = stoi(input[0]);
            arr[i][1] = stoi(input[1]);
        }

        // 입력 데이터 오름차순으로 정렬, 시작 시간이 같으면 끝나는 시간을 오름차순
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        // 우선순위 큐 만든 뒤 정렬된 배열의 첫 번째 끝나는 시간 저장
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0][1]);

        // 배열을 두 번째 값부터 순회하면서
        for (int i = 1; i < n; i++) {
            // 시작 시간이 peek()보다 작으면 pq에서 하나 삭제
            if (pq.peek() <= arr[i][0]) pq.poll();

            // 순회하면서 현재 end 값을 pq에 넣는다.
            pq.add(arr[i][1]);
        }

        // pq에 남은 갯수가 필요한 강의실 갯수
        System.out.println(pq.size());
        br.close();
    }

    private int stoi(String readLine) {
        return Integer.parseInt(readLine);
    }
}
