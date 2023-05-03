package baekjoon.exhaustivesearch;

import java.util.Scanner;

public class MovieDirectorShome {

    public void exhaustiveSearch() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int minEnd = 666;
        int count = 1;

        while (count != N) {
            minEnd++;
            if (String.valueOf(minEnd).contains("666")) {
                count++;
            }
        }
        System.out.println(minEnd);
    }
}
