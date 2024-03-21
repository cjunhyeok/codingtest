package programmers.dfs;

import java.util.*;

public class WordChange {

    private static Map<String, Boolean> map = new HashMap();
    private static int answer = 0;
    private static String targetWord = "";
    private static int result = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {

        targetWord = target;
        map.put(begin, true);
        map.put(target, false);
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], false);
        }

        dfs(begin, words);

        if(result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }

    private static void dfs(String begin, String[] words) {
        map.put(begin, true);

        if (begin.equals(targetWord)) {
            result = Math.min(answer, result);
            map.put(begin, false);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int count = 0;
            for(int j = 0; j < word.length(); j++) {
                if(begin.charAt(j) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == (word.length() - 1)) {
                if (map.get(word) == false) {
                    System.out.println(word);
                    answer++;
                    dfs(word, words);
                    answer--;
                }
            }
        }
    }
}
