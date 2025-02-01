package retry.baekjoon.implementation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Big {

    // 7568
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int[] value = new int[]{x, y};
            list.add(value);
        }

        for (int[] ints : list) {

            int count =  1;
            for (int i = 0; i < list.size(); i++) {
                int[] value = list.get(i);

                if (ints[0] < value[0] && ints[1] < value[1]) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
}
