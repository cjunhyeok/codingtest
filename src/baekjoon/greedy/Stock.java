package baekjoon.greedy;

import java.util.Scanner;

public class Stock {

    //11501
    public void greedy() {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        long tests[] = new long[testcase];

        for(int i = 0 ; i < testcase ; i++ ) {

            int days = sc.nextInt();
            long stocks[] = new long[days];
            long max = 0;
            for(int j = 0 ; j < days ; j++ ) {
                stocks[j] = sc.nextInt();
            }

            for(int j = days - 1; j >= 0; j--) {
                if(stocks[j] > max) {
                    max = stocks[j];
                }else {
                    tests[i] += (max - stocks[j]);
                }
            }
        }

        for(long i : tests) {
            System.out.println(i);
        }
    }
}
