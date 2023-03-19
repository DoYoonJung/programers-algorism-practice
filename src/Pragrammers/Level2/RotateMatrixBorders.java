package Pragrammers.Level2;
//행렬 테두리 회전하기
public class RotateMatrixBorders {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries={{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        int[][] map = new int[rows][columns];
        int[] result = new int[queries.length];
        int count = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = count++;
            }
        }
        int k=0;
        while (k < queries.length) {
            int x1 = queries[k][0]-1;
            int y1 = queries[k][1]-1;
            int x2 = queries[k][2]-1;
            int y2 = queries[k][3]-1;

            int min = map[x1][y1];
            int remember = map[x1][y1];
            for (int i = x1; i < x2; i++) {
                map[i][y1] = map[i + 1][y1];
                min=Math.min(min, map[i][y1]);
            }

            for (int i = y1; i < y2; i++) {
                map[x2][i] = map[x2][i + 1];
                min = Math.min(min, map[x2][i]);
            }

            for (int i = x2; i > x1; i--) {
                map[i][y2] = map[i - 1][y2];
                min = Math.min(min, map[i][y2]);
            }

            for (int i = y2; i > y1+1; i--) {
                map[x1][i] = map[x1][i - 1];
                min = Math.min(min,map[x1][i]);
            }

            map[x1][y1 + 1] = remember;
            result[k++] = min;
        }

        for (int i = 0; i < queries.length; i++) {
            System.out.println(result[i]);

        }
    }


}




