package programmers.lv2;

import java.util.*;

public class Process {

    public int solution(int[] priorities, int location) {
        // 우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

//    public static int solution(int[] priorities, int location) {
//        int answer = -1;
//
//        Queue<Integer[]> leftQueue = new LinkedList();
//        Queue<Integer[]> rightQueue = new LinkedList();
//        boolean isLeft = true;
//
//        Integer[] priority = new Integer[2];
//        priority[0] = priorities[0];
//        priority[1] = 0;
//        leftQueue.add(priority);
//
//        for (int i = 1; i < priorities.length; i++) {
//            priority = new Integer[2];
//            priority[0] = priorities[i]; // 우선순위
//            priority[1] = i; // location
//
//            Integer leftQueuePeek = leftQueue.peek()[0];
//
//            if (priority[0] > leftQueuePeek) {
//                isLeft = false;
//            }
//
//            if (isLeft) {
//                leftQueue.add(priority);
//            } else {
//                rightQueue.add(priority);
//            }
//        }
//
//        int count = 0;
//
//        while (!rightQueue.isEmpty()) {
//            Integer[] poll = rightQueue.poll();
//            if (poll[1] == location) {
//                answer = count + 1;
//                return answer;
//            } else {
//                count++;
//            }
//        }
//
//        while (!leftQueue.isEmpty()) {
//            Integer[] poll = leftQueue.poll();
//            if (poll[1] == location) {
//                answer = count + 1;
//                return answer;
//            } else {
//                count++;
//            }
//        }
//
//        return answer;
//    }
}
