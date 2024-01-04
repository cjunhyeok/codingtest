package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baek30 {

    // 10610
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        Integer total = 0;
        List<Character> value = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            char val = N.charAt(i);
            int intVal = Integer.parseInt(String.valueOf(val));
            value.add(val);
            total = total + intVal; // 각 자리수 합이 3의 배수이면 3의 배수
        }

        if (!N.contains("0") || total % 3 != 0) {
            System.out.println(-1);
            System.exit(0);
        }

        value.sort(Collections.reverseOrder());

        for (Character character : value) {
            System.out.print(character);
        }
    }
}
