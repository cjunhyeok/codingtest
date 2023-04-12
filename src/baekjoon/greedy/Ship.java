package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ship {

    // 1092
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> crane = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            crane.add(scanner.nextInt());
        }

        int M = scanner.nextInt();
        List<Integer> box = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            box.add(scanner.nextInt());
        }

        Collections.sort(crane, Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());

        if (box.get(0) > crane.get(0)) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        while (!box.isEmpty()) {
            int idx = 0;
            for (int i = 0; i < N;) {
                if (idx == box.size()) break;
                else if (crane.get(i) >= box.get(idx)) {
                    box.remove(idx);
                    i++;
                } else idx++;
            }
            count++;
        }

        System.out.println(count);
    }
}
