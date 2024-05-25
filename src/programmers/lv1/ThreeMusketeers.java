package programmers.lv1;

import java.util.Arrays;

public class ThreeMusketeers {

    private static int answer = 0;

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {

            for (int j = i + 1; j < number.length - 1; j++) {

                for (int k = j + 1; k < number.length; k++) {
                    int isZero = number[i] + number[j] + number[k];
                    if (isZero == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static int combinationSolution(int[] number) {
        combination(number, 3, 0, 0, new int[3]);
        return answer;
    }

    public static void combination(int[] number, int limit, int startIdx, int cnt, int[] selectArr) {
        // 종료조건
        if (cnt == limit) {
            answer += Arrays.stream(selectArr).sum() == 0? 1 : 0;
            return;
        }

        for (int i = startIdx; i < number.length; i++) {
            selectArr[cnt] = number[i];
            combination(number, limit, i+1, cnt+1, selectArr);
        }
    }
}
