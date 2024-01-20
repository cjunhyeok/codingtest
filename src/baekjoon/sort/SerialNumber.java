package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SerialNumber {

    // 1431
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> serialNumbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String serial = br.readLine();
            serialNumbers.add(serial);
        }

        Collections.sort(serialNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int o1Sum = 0;
                int o2Sum = 0;

                if (o1.length() == o2.length()) {

                    for (int i = 0; i < o1.length(); i++) {
                        char val = o1.charAt(i);
                        String o1Val = String.valueOf(val);
                        try {
                            o1Sum = o1Sum + Integer.parseInt(o1Val);
                        } catch (Exception e) {
                            continue;
                        }
                    }

                    for (int i = 0; i < o2.length(); i++) {
                        char val = o2.charAt(i);
                        String o2Val = String.valueOf(val);
                        try {
                            o2Sum = o2Sum + Integer.parseInt(o2Val);
                        } catch (Exception e) {
                            continue;
                        }
                    }

                    if (o1Sum == o2Sum) {
                        return o1.compareTo(o2);
                    } else {
                        return o1Sum - o2Sum;
                    }

                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String serialNumber : serialNumbers) {
            System.out.println(serialNumber);
        }
    }
}
