package Pragrammers.Level3;
//정수 삼각형
public class IntegerTriangle {

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        if(triangle.length==1) System.out.println(triangle[0][0]);


        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j]+=Math.max(triangle[i+1][j],triangle[i+1][j+1]);
                System.out.println(i+" "+j+" "+triangle[i][j]);
            }
            System.out.println();
        }
    }
}
