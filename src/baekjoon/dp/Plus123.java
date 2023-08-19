package baekjoon.dp;

import java.util.Scanner;

public class Plus123 {

    // 9095

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int nums[] = new int[11];

        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 4;

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            for (int j = 4; j <= N; j++) {
                nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
            }
            System.out.println(nums[N]);
        }
    }
}
