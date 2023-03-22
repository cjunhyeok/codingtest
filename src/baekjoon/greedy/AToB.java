package baekjoon.greedy;

import java.util.Scanner;

public class AToB {

    // 16953
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int answer = 0;

        while (true) {
            if (B > A) {
                if ((B - 1) % 10 == 0) {
                    B = (B - 1) / 10;
                } else if (B % 2 != 0){
                    break;
                } else {
                    B = B / 2;
                }
                answer++;
            } else {
                break;
            }
        }

        if (B == A) {
            System.out.println(answer + 1);
        } else {
            System.out.println("-1");
        }
    }
}
