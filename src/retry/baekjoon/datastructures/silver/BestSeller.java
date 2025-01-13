package retry.baekjoon.datastructures.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BestSeller {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();

            if (map.containsKey(book)) {
                Integer count = map.get(book);
                map.put(book, count + 1);
            } else {
                map.put(book, 1);
            }
        }

        int answer = 0;
        List<String> books = new ArrayList<>();
        for (String key : map.keySet()) {
            Integer count = map.get(key);

            if (count > answer) {
                books = new ArrayList<>();
                books.add(key);
                answer = count;
            } else if (count == answer) {
                books.add(key);
            }
        }


        Collections.sort(books);
        System.out.println(books.get(0));
    }
}
