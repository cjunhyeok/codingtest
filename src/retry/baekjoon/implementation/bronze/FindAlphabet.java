package retry.baekjoon.implementation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {

    // 10809
    public static void main(String[] args) throws IOException {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for (char c : alphabet) {

            int characterIndex = -1;
            for (int i = 0; i < line.length(); i++) {
                char value = line.charAt(i);

                if (value == c) {
                    characterIndex = i;
                    break;
                }
            }

            System.out.print(characterIndex + " ");
        }
    }
}
