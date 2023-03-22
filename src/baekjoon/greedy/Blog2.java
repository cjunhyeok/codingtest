package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Blog2 {

    // 20365
    public void greedy() {
        Scanner scanner = new Scanner(System.in);

        List<String> bstr =  new ArrayList<>();
        List<String> rstr = new ArrayList<>();
        int result = 0;
        int size = scanner.nextInt();
        String str = scanner.next();

        // R을 기준으로 파싱
        StringTokenizer st = new StringTokenizer(str, "R");
        while (st.hasMoreTokens()) {
            bstr.add(st.nextToken());
        }

        // B를 기준으로 파싱
        st = new StringTokenizer(str, "B");
        while (st.hasMoreTokens()) {
            rstr.add(st.nextToken());
        }

        if (rstr.size() >= bstr.size()) {
            result = 1 + bstr.size();
        } else {
            result  = 1 + rstr.size();
        }

        System.out.println(result);
    }
}
