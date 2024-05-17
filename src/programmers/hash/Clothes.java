package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Clothes {

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (!map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], 1);
            } else {
                Integer value = map.get(clothes[i][1]);
                map.put(clothes[i][1], value + 1);
            }
        }

        for (Integer value : map.values()){
            answer *= value + 1;
        }

        return answer - 1;
    }
}
