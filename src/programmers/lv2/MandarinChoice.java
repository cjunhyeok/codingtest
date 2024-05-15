package programmers.lv2;

import java.util.*;

public class MandarinChoice {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;

        Map<Integer, Integer> mandarin = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {

            if (mandarin.get(tangerine[i]) == null) {
                mandarin.put(tangerine[i], 1);
            } else {
                Integer value = mandarin.get(tangerine[i]);
                mandarin.put(tangerine[i], value + 1);
            }
        }

        List<Integer> mandarinList = new ArrayList<>(mandarin.values());
        Collections.sort(mandarinList, Collections.reverseOrder());

        for (Integer value : mandarinList) {
            if (answer + value >= k) {
                count++;
                break;
            } else {
                answer += + value;
                count++;
            }
        }

        return count;
    }
}
