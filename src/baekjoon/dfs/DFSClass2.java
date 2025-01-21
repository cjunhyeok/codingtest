//package baekjoon.dfs;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class DFSClass2 {
//
//    static int N, M , R;
//    static int u, v;
//    static List<Integer>[] arr;
//    static boolean[] visited;
//
//    // 24480
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//        R = Integer.parseInt(st.nextToken());
//
//        arr = new ArrayList[N + 1];
//
//        for (int i = 1; i <= N; i++) {
//            arr[i] = new ArrayList<>();
//        }
//
//        visited = new boolean[N + 1];
//
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            u = Integer.parseInt(st.nextToken());
//            v = Integer.parseInt(st.nextToken());
//
//            arr[u][v] = arr[v][u] = 1;
//        }
//
//        dfs(1);
//
//        System.out.println(0);
//    }
//
//
//    public static void dfs(int start) {
//        visited[start] = true;
//
//        System.out.println(start);
//
//        for (int i = 0; i <= N; i++) {
//            if (arr[start][i] == 1 && !visited[i]) {
//                dfs(i);
//            }
//        }
//    }
//}
