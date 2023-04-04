package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoomAssignment {

    // 1931
    public void greedy() {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        /*
        time[0][1] : 시작 시점
        time[0][1] : 종료 시점
         */
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            time[i][0] = scanner.nextInt(); // 시작 시간
            time[i][1] = scanner.nextInt(); // 종료 시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for (int i = 0; i < N; i++) {

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if (prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
