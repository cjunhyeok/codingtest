package retry.baekjoon.implementation.silver;

public class SelfNumber {

    // 4673
    public static void main(String[] args) {

        boolean[] booleans = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {

            int index = i;
            int sum = i;
            while (index != 0) {
                sum = sum + index % 10;
                index = index / 10;
            }

            if (sum <= 10000) {
                booleans[sum] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!booleans[i]) {
                System.out.println(i);
            }
        }
    }
}