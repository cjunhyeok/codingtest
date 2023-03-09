package baekjoon.greedy;

import java.util.Scanner;

public class poliomino {

    public void greedy() {

        Scanner scanner = new Scanner(System.in);
        String arg = scanner.next();

        final String A = "AAAA";
        final String B = "BB";

        String firstReplace = arg.replace("XXXX", A);
        String lastReplace = firstReplace.replace("XX", B);

        if (lastReplace.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(lastReplace);
        }
    }
}
