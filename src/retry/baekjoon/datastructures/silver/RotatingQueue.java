package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RotatingQueue {

    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            positions.add(value);
        }

        int positionIndex = 0;
        int count = 0;
        while (true) {

            Integer first = deque.getFirst();
            Integer position = positions.get(positionIndex);

            if (first.equals(position)) {
                deque.pollFirst();
                positionIndex++;

                if (positionIndex == M) {
                    break;
                }
            }

            // 값 인덱스 찾기
            Integer valueIndex = 0;
            for (Integer integer : deque) {
                if (integer.equals(positions.get(positionIndex))) {
                    break;
                } else {
                    valueIndex++;
                }
            }

            if (valueIndex > (deque.size() / 2)) {
                while (true) {
                    first = deque.getFirst();
                    position = positions.get(positionIndex);

                    if (first.equals(position)) {
                        break;
                    } else {
                        Integer last = deque.pollLast();
                        deque.addFirst(last);
                        count++;
                    }
                }
            } else {
                while (true) {
                    first = deque.getFirst();
                    position = positions.get(positionIndex);

                    if (first.equals(position)) {
                        break;
                    } else {
                        first = deque.pollFirst();
                        deque.addLast(first);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
