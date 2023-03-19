package Pragrammers.Level2;
// 카카오프렌즈 컬러링북
public class KakaoFriendsColoringBook {
    static int[][] map;
    static boolean[][] visit;

    static int[] d1 = {-1, 1, 0, 0};
    static int[] d2 = {0, 0, 1, -1};
    static int check = 1;
    static int[] result = new int[2];
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        map = picture;
        visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0 && !visit[i][j]) {
                    result[0]++;
                    check = 1;
                    DFS(i, j, 0, map[i][j]);
                }
            }
        }

        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    private static void DFS(int x, int y, int cnt, int target) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + d1[i];
            int yy = y + d2[i];
            if (xx >= 0 && yy >= 0 && xx < map.length && yy < map[0].length && map[xx][yy] == target && !visit[xx][yy]) {
                check++;
                result[1] = Math.max(check, result[1]);
                System.out.println(xx+" "+yy+" "+check);

            }
        }
    }
}
