package baekjoon.greedy;

import java.util.Scanner;

public class BulbAndSwitch {

    // 2138
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 3
        String beforeString = null;
        String afterString = null;
        int[] before = new int[N];
        int[] lightUpBefore = new int[N];
        int[] after = new int[N];
        int cntLight = 0;
        int cnt = 0;

        beforeString = scanner.next(); // 000
        afterString = scanner.next(); // 010

        for (int i = 0; i < N; i++) {
            before[i] = beforeString.charAt(i) - '0';
            lightUpBefore[i] = beforeString.charAt(i) - '0';
            after[i] = afterString.charAt(i) - '0';
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (after[i] == 1) {
                    lightUpBefore[i] = (lightUpBefore[i] == 1) ? 0 : 1;
                    lightUpBefore[i + 1] = (lightUpBefore[i + 1] == 1) ? 0 : 1;
                    cntLight++;
                } else {
                    before[i] = (before[i] == 1) ? 0 : 1;
                    before[i + 1] = (before[i + 1] == 1) ? 0 : 1;
                    cnt++;
                }
            } else if (i == N-1) {
                if (before[i - 1] != after[i - 1]) {
                    before[i - 1] = (before[i - 1] == 1) ? 0 : 1;
                    before[i] = (before[i] == 1) ? 0 : 1;
                    cnt++;
                }
                if (lightUpBefore[i - 1] != after[i - 1]) {
                    lightUpBefore[i - 1] = (lightUpBefore[i - 1] == 1) ? 0 : 1;
                    lightUpBefore[i] = (lightUpBefore[i] == 1) ? 0 : 1;
                    cntLight++;
                }
            } else {
                if (before[i - 1] != after[i - 1]) {
                    before[i  - 1] = (before[i - 1] == 1) ? 0 : 1;
                    before[i] = (before[i] == 1) ? 0 : 1;
                    before[i + 1] = (before[i + 1] == 1) ? 0 : 1;
                    cnt++;
                }
                if (lightUpBefore[i - 1] != after[i - 1]) {
                    lightUpBefore[i - 1] = (lightUpBefore[i - 1] == 1) ? 0 : 1;
                    lightUpBefore[i] = (lightUpBefore[i] == 1) ? 0 : 1;
                    lightUpBefore[i + 1] = (lightUpBefore[i + 1] == 1) ? 0 : 1;
                    cntLight++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            if (before[i] != after[i]) {
                cnt = Integer.MAX_VALUE;
            }
            if (lightUpBefore[i] != after[i]) {
                cntLight = Integer.MAX_VALUE;
            }
        }

        if (cnt == Integer.MAX_VALUE && cntLight == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(Math.min(cnt, cntLight));
        }
    }
}
