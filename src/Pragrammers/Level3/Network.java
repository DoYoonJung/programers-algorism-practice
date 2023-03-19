package Pragrammers.Level3;
//네트워크
public class Network {

    static int MaxCount = 0;
    static boolean[][] visit;
    static int[][] computer;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        computer = computers.clone();
        visit = new boolean[n][n];
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {

                if (!visit[i][j] && computers[i][j] == 1) {

                    System.out.println(i+" "+j);
                    MaxCount++;
                    DFS(i, j, n);
                }
            }
        }
        System.out.println(MaxCount);
    }

    private static void DFS(int x, int y, int n) {
        visit[x][y]=true;
        visit[y][x]=true;
        for (int i = 0; i < n; i++) {
            if (!visit[x][i] && computer[x][i] == 1) {
                DFS(i, x, n);
            }
        }
    }
}
