package programmers.dfs;

public class Network {

    private static boolean[] visited;
    private static int[][] pcs;
    private static int count = 0;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        pcs = computers;

        for (int i = 0; i < computers.length; i++) {

            if(!visited[i]) {
                count++;
                dfs(i);
            }

        }

        return count;
    }

    private void dfs(int start) {
        visited[start] = true;

        for (int i = 0; i < pcs.length; i++) {
            if (!visited[i] && pcs[start][i] == 1) {
                dfs(i);
            }
        }
    }
}
