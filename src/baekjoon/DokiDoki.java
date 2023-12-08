package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class DokiDoki {

    // 12789
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> firstLane = new LinkedList<>();
        Stack<Integer> secondLane = new Stack<>();

        int lane = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < N; i++){
            int val = Integer.parseInt(st.nextToken());
            firstLane.add(val); // 5, 4, 1, 3, 2
        }

        while(!firstLane.isEmpty()) {
            if (firstLane.peek() == lane) {
                firstLane.poll();
                lane = lane + 1;
            } else if (!secondLane.isEmpty() && secondLane.peek() == lane) {
                secondLane.pop();
                lane = lane + 1;
            } else if (firstLane.peek() != lane){
                Integer first = firstLane.poll();
                secondLane.push(first);
            }
        }

        while (!secondLane.isEmpty()) {
            if (secondLane.peek() == lane) {
                secondLane.pop();
                lane = lane + 1;
            } else {
                break;
            }
        }

        if (firstLane.isEmpty() && secondLane.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

    public static void firstSolution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> firstLane = new LinkedList<>();
        Stack<Integer> secondLane = new Stack<>();

        int lane = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++){
            int val = Integer.parseInt(st.nextToken());
            firstLane.add(val); // 5, 4, 1, 3, 2
        }

        for (int i = 0; i < N; i++) {

            if (!secondLane.isEmpty()) {
                if (secondLane.peek() == lane) {
                    secondLane.pop();
                    lane = lane + 1;
                }
            }

            if (!firstLane.isEmpty()) {
                if (firstLane.peek() == lane) {
                    firstLane.poll();
                    lane = lane + 1;
                } else if (firstLane.peek() != lane){
                    Integer first = firstLane.poll();
                    secondLane.push(first);
                    N = N + 1;
                }
            }
        }

        if (firstLane.isEmpty() && secondLane.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
