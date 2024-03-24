package programmers;

import java.util.*;

public class MakeMinimumValue {

    public static int solution(int[] A, int[] B) {
        int ans = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }

        while (!a.isEmpty()) {
            ans += a.poll() * b.poll();
        }

        return ans;
    }

    public int mySolution(int []A, int []B)
    {
        int answer = 0;

        int multiple = 0;
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            multiple = A[i] * B[A.length - 1 - i];
            sum = sum + multiple;
        }

        return sum;
    }
}
