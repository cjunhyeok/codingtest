package baekjoon.exhaustivesearch;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarfs {

    // 2309
    public void exhaustiveSearch() {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
            sum += heights[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    heights[i] = 0;
                    heights[j] = 0;
                    Arrays.sort(heights);
                    for (int k = 2; k< 9; k++) {
                        System.out.println(heights[k]);
                    }
                    return;
                }
            }
        }
    }
}
