package baekjoon.greedy;

import java.util.Scanner;

public class change {
    // 14916
    public void greedy() {
        final int two = 2;
        final int five = 5;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();

        while (true) {

            if (change == 0) {
                break;
            }

            if (change % five == 0) {
                answer = change / five;
                change = change % five;
            } else if (change % two == 0){
                answer = change / two;
                change = change % two;
            } else {
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}
