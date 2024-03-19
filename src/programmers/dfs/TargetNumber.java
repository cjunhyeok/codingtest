package programmers.dfs;

public class TargetNumber {
    static int result = 0;

    // KIT
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return result;
    }

    private static void dfs(int[] numbers, int target, int answer, int index) {
        if(index == numbers.length) {
            if(target == answer) {
                result++;
            }
            return;
        }
        dfs(numbers, target, answer + numbers[index], index + 1);
        dfs(numbers, target, answer - numbers[index], index + 1);
    }
}
