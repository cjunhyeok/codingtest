package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RepeatSequence {

    static int answer = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    // 2331
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Integer value = 0;
        Integer result = 0;

        List<Integer> sequence = new ArrayList<>();
        sequence.add(A);

        while (true) {
            Integer temp = sequence.get(sequence.size() - 1);

            value = 0;

            while (temp != 0) {
                value = value + (int) Math.pow((double) temp % 10, P);
                temp = temp / 10;
            }

            if (sequence.contains(value)) {
                result = sequence.indexOf(value);
                break;
            }

            sequence.add(value);
        }

        System.out.println(result);
    }

    public static void dfsSolution(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int P = sc.nextInt();

        list.add(Integer.parseInt(A));
        DFS(A, P);
        System.out.println(answer);
        sc.close();
    }

    static void DFS(String A, int P) {
        // D[n-1]의 각 자리의 숫자를 p번 곱한 수들의 합 구하기
        int total = 0;
        for(char c : A.toCharArray()) {
            int tmp = 1;
            for(int i = 0; i < P; i++) {
                tmp *=  c - '0';
            }
            total += tmp;
        }

        // 반복 수열을 발견하면
        if(list.contains(total)) {
            // 반복 수열의 처음 인덱스 값 리턴
            answer = list.indexOf(total);
        }
        else {
            list.add(total);
            DFS(String.valueOf(total), P);
        }
    }
}
