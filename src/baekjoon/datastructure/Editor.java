package baekjoon.datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor {

    // 1406
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String sentence = br.readLine();
//
//        LinkedList<Character> list = new LinkedList<>();
//
//        for (int i = 0; i < sentence.length(); i++) {
//            list.add(sentence.charAt(i)); // a, b, c, d
//        }
//        int cursor = sentence.length();
//        int length = sentence.length();
//
//        int N = Integer.parseInt(br.readLine());
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            String token = st.nextToken();
//
//            if (token.equals("L")) {
//                if (cursor != 0) {
//                    cursor = cursor - 1;
//                }
//            } else if (token.equals("D")) {
//                if (cursor != length) {
//                    cursor = cursor + 1;
//                }
//            } else if (token.equals("B")) {
//                if (cursor != 0) {
//                    cursor = cursor - 1;
//                    list.remove(cursor);
//                    length = length - 1;
//                }
//            } else if (token.equals("P")) {
//                Character word = st.nextToken().charAt(0);
//                list.add(cursor, word);
//                cursor = cursor + 1;
//                length = length + 1;
//            }
//        }
//
//        for (Character character : list) {
//            System.out.print(character);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> leftSt = new Stack<String>();
        Stack<String> rightSt = new Stack<String>();

        //처음 커서는 문장의 맨 뒤에서 시작하기 때문에 왼쪽 스택에 초기 문자를 모두 넣어줌 (ex. abc|)
        String[] arr = str.split("");
        for(String s : arr) { //Enhanced For Loop 사용
            leftSt.push(s);
        }

        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            //StringTokenizer st = new StringTokenizer(reader.readLine());
            //String c = st.nextToken();

            switch(c) {
                case 'L':
                    if(!leftSt.isEmpty())
                        rightSt.push(leftSt.pop());

                    break;
                case 'D':
                    if(!rightSt.isEmpty())
                        leftSt.push(rightSt.pop());

                    break;
                case 'B':
                    if(!leftSt.isEmpty()) {
                        leftSt.pop();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    leftSt.push(String.valueOf(t));
                    //leftSt.push(st.nextToken());

                    break;
                default:
                    break;
            }
        }

        //Stack은 LIFO 구조이기 때문에
        //왼쪽 스택에 있는 데이터들을 모두 오른쪽으로 옮긴 뒤에 오른쪽에 있는 모든 내용을 출력한다.
        while(!leftSt.isEmpty())
            rightSt.push(leftSt.pop());

        while(!rightSt.isEmpty())
            bw.write(rightSt.pop());

        bw.flush();
        bw.close();
    }
}
