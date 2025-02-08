package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GasStation {

    // 13305
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> oils = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            oils.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            prices.add(Integer.parseInt(st.nextToken()));
        }

        Integer firstOil = oils.get(0);
        Integer firstPrice = prices.get(0);

        Long sum = Long.valueOf(firstOil) * Long.valueOf(firstPrice);
        int minPrice = firstPrice;

        for (int i = 1; i < prices.size() - 1; i++) {
            Integer oil = oils.get(i);
            Integer price = prices.get(i);

            if (minPrice > price) {
                minPrice = price;
            }

            sum = sum + (Long.valueOf(oil) * Long.valueOf(minPrice));
        }

        System.out.println(sum);
    }
}
