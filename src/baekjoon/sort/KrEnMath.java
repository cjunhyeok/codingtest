package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class KrEnMath {

    // 10825
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int kr = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students.add(new Student(name, kr, en, math));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.kr.equals(o2.kr)) {
                    if (o1.en.equals(o2.en)) {
                        if (o1.math.equals(o2.math)) {
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;
                    }
                     return o1.en - o2.en;
                }
                return o2.kr - o1.kr;
            }
        });

        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    static class Student{
        String name;
        Integer kr;
        Integer en;
        Integer math;

        public Student() {
        }

        public Student(String name, Integer kr, Integer en, Integer math) {
            this.name = name;
            this.kr = kr;
            this.en = en;
            this.math = math;
        }
    }
}
