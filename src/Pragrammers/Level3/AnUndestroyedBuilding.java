package Pragrammers.Level3;
//파괴되지 않는 건물
//새로운 기술, 누적합 사용
//2차원 배열 특정한 영역의 값을 특정 값으로 더해줄 때 용이
public class AnUndestroyedBuilding {

    public static void main(String[] args) {
        int[][] board={{1,2,3},{4,5,6},{7,8,9}};
        int[][] skill={{1,1,1,2,2,4},{1,0,0,1,1,2},{2,2,0,2,0,100}};

        int[][] sum = new int[board.length+1][board[0].length+1];
        System.out.println(board[0].length+1);
        for (int i = 0; i < skill.length; i++) {
            int y1 = skill[i][1];
            int x1 = skill[i][2];
            int y2 = skill[i][3];
            int x2 = skill[i][4];
            int price = skill[i][5] * (skill[i][0] == 1 ? -1 : 1);

            sum[y1][x1] += price;
            sum[y1][x2+1] += -price;
            sum[y2+1][x1] += -price;
            sum[y2+1][x2+1] += price;

        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                sum[i][j] += sum[i - 1][j];
            }
        }

        for (int i = 1; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                sum[j][i] += sum[j][i-1];
            }
        }

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]+=sum[i][j];
                if(board[i][j]>0) count++;
            }
        }

        System.out.println(count);

    }


}
