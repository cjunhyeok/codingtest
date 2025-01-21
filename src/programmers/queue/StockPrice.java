package programmers.queue;
import java.util.*;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> priceQueue = new LinkedList<>();

        for (int price : prices) {
            priceQueue.add(price);
        }

        int number = 0;
        while (priceQueue.peek() != null) {
            int value = priceQueue.poll();

            answer[number] = 0;

            for (Integer integer : priceQueue) {
                answer[number]++;
                if (value > integer) {
                    break;
                }
            }

            number++;
        }

        return answer;
    }

    public int[] mySolution(int[] prices) {

        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < prices.length; i++) {
            queue.add(prices[i]);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            answer[count] = 0;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (!queue.isEmpty()) {
                    int top = queue.poll();
                    answer[count]++;
                    if (poll > top) {
                        queue.add(top);
                        break;
                    }
                    queue.add(top);
                }
            }
            count++;
        }

        return answer;
    }
}
