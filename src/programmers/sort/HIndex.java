package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HIndex {

    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> value = new ArrayList();

        Integer[] values = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(values, Collections.reverseOrder());

        for(int i = 0; i < values.length; i++) {
            int min = Math.min((i + 1), values[i]);
            value.add(min);
        }

        answer = Collections.max(value);

        return answer;
    }
}
