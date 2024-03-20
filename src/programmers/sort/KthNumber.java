package programmers.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> list = new ArrayList();
        for (int t = 0; t < commands.length; t++) {
            int[] command = commands[t];
            List<Integer> value = new ArrayList();

            int i = command[0]; // 2
            int j = command[1]; // 5
            int k = command[2]; // 3
            for (int l = i; l <= j; l++) {
                value.add(array[l - 1]);
            }

            Collections.sort(value);
            int val = value.get(k - 1);

            answer[t] = val;
        }

        return answer;
    }
}
