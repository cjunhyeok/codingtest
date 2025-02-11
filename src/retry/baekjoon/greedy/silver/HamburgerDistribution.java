package retry.baekjoon.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class HamburgerDistribution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        char[] arr = new char[N];
        boolean[] visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        arr = st.nextToken().toCharArray();

        int answer = 0;
        for(int i=0;i<N;i++) {
            if(arr[i] == 'P') { //사람을 만났다면, K인 것 앞에서부터
                for(int j=-K;j<=K;j++) {
                    if( i+j >= N) break;
                    if( i+j < 0) continue;

                    if(arr[i+j] == 'H' && visited[i+j] == false) {
                        visited[i+j] = true;
                        answer += 1;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
