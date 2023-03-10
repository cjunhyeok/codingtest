package baekjoon.recursive;

import java.util.Scanner;

public class Factorial {

    // 10872
    public void recursive() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int sum = inFactorial(n);
        System.out.println(sum);
    }

    public int inFactorial(int n) {
        if (n <= 1) return 1;
        return n * inFactorial(n - 1);
    }
}
