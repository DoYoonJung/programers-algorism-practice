package Pragrammers.Level2;

//단체사진 찍기
public class TakeAGroupPhoto {
    static boolean[] visit;
    static char[] arr = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static int nn;
    static String[] result;

    static int answer = 0;
    public static void main(String[] args) {
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};

        result = data.clone();
        nn = n;
        visit = new boolean[8];

        getReturn(0, "");
        System.out.println(answer);
    }

    private static void getReturn(int cnt, String s) {

        if (cnt >= 8) {
            checkLocation(s);
        }else{
            for (int i = 0; i < 8; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    getReturn(cnt + 1, s + arr[i]);
                    visit[i] = false;
                }
            }
        }


    }

    private static void checkLocation(String s) {

        for (int i = 0; i < nn; i++) {
            int first = s.indexOf(result[i].charAt(0));
            int second = s.indexOf(result[i].charAt(2));

            int sum = Math.abs(first - second) - 1;
            char operator = result[i].charAt(3);
            int num = result[i].charAt(4)-'0';

            if (operator == '=') {
                if(sum!=num) return;
            } else if (operator == '>') {
                if(sum<=num) return;
            }else{
                if(sum>=num) return;
            }
        }
        answer++;
    }
}
