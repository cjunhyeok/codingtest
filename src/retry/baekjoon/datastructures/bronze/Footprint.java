package retry.baekjoon.datastructures.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Footprint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String command = br.readLine();
        int x = 0;
        int y = 0;

        Set<String> commands = new HashSet<>();
        commands.add(String.valueOf(x) + "," + String.valueOf(y));

        for (int i = 0; i < N; i++) {
            char c = command.charAt(i);
            if (c == 'E') {
                x =  x + 1;
            } else if (c == 'W') {
                x = x - 1;
            } else if (c == 'S') {
                y = y - 1;
            } else {
                y = y + 1;
            }

            commands.add(String.valueOf(x) + "," + String.valueOf(y));
        }

        System.out.println(commands.size());
    }
}
