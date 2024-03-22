package programmers.queue;

import java.util.*;

public class FunctionDevelopment {

    public List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < progresses.length; i++) {

            int value = 0;
            if(((100 - progresses[i]) % speeds[i]) != 0) {
                value = ((100 - progresses[i]) / speeds[i]) + 1;
            } else {
                value = ((100 - progresses[i]) / speeds[i]);
            }
            queue.add(value);
        }

        int max = queue.poll();
        int count = 1;
        List<Integer> answer = new ArrayList();

        while(!queue.isEmpty()) {
            Integer poll = queue.poll();

            if(poll > max) {
                answer.add(count);
                count = 1;
                max = poll;
            } else {
                count++;
            }
        }
        answer.add(count);

        return answer;
    }
}
