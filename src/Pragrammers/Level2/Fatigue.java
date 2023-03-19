package Pragrammers.Level2;

public class Fatigue {
    static boolean[] arr;
    static int answer = 0;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        arr = new boolean[dungeons.length];
        getReturn(k, dungeons, 0);
        System.out.println(answer);
    }

    private static void getReturn(int k, int[][] dungeons, int cnt) {
        if (cnt !=0 ) {
            answer = Math.max(answer, cnt);
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (!arr[i] && k >= dungeons[i][0]) {
                arr[i] = true;
                getReturn(k - dungeons[i][1], dungeons, cnt + 1);
                arr[i] = false;
            }
        }

    }
}
