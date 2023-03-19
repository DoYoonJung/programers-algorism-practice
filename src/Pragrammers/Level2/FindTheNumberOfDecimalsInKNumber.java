package Pragrammers.Level2;
//k진수에서 소수 개수 구하기
public class FindTheNumberOfDecimalsInKNumber {

    public static void main(String[] args) {

        int n = 110011;
        int k = 10;
        int answer = 0;
        String num = Integer.toString(n, k);
        String temp[] = num.split("0");

        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")) {
                if (getReturn(Long.parseLong(temp[i]))) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    private static boolean getReturn(long cnt) {
        int count = 0;
        if(cnt==1) return false;
        else if(cnt==2||cnt==3) return true;
        for (int i = 2; i < Math.sqrt(cnt)+1; i++ ) {
            if (cnt % i == 0) {
                count++;
                if(count>=1) return false;
            }
        }

        return true;
    }
}
