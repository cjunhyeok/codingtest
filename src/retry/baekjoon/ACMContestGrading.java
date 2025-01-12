package retry.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ACMContestGrading {

    public static void main(String[] args) throws IOException {

        Map<String, int[]> correct = new HashMap<>();
        Map<String, int[]> wrong = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (line.equals("-1")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line);

            int time = Integer.parseInt(st.nextToken());
            String problem = st.nextToken();
            String answer = st.nextToken();

            if (answer.equals("wrong")) {
                // 틀렷을 경우

                if (wrong.containsKey(problem)) {
                    int[] count = wrong.get(problem);
                    count[0] = time;
                    count[1] = count[1] + 1;

                    wrong.put(problem, count);
                } else {
                    int[] count = new int[2];
                    count[0] = time;
                    count[1] = 1;

                    wrong.put(problem, count);
                }

            } else {
                // 맞았을 경우
                if (wrong.containsKey(problem)) {
                    int[] count = wrong.get(problem);
                    count[0] = time;
                    count[1] = count[1] + 1;

                    correct.put(problem, count);
                } else {
                    int[] count = new int[2];
                    count[0] = time;
                    count[1] = 1;

                    correct.put(problem, count);
                }
            }
        }

        int sum = 0;
        for (String key : correct.keySet()) {
            int[] ints = correct.get(key);
            if (ints[1] > 1) {
                sum = sum + ((ints[1] - 1) * 20);
            }
            sum = sum + ints[0];
        }
        System.out.println(correct.size() + " " + sum);
    }
}
