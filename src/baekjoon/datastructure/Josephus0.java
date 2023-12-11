package baekjoon.datastructure;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus0 {

    // 11866
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        sb.append('<');
        while(list.size() > 1) {
            index = (index + (K - 1)) % list.size();

            sb.append(list.remove(index)).append(", ");
        }

        sb.append(list.remove()).append('>');
        System.out.println(sb);
    }
}
