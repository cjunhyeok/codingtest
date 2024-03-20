package programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> values = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }

        if (values.size() <= (nums.length / 2)) {
            answer = values.size();
        } else {
            answer = (nums.length / 2);
        }

        return answer;
    }
}
