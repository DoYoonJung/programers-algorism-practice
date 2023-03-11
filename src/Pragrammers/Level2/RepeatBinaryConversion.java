package Pragrammers.Level2;
//이진 변환 반복하기
public class RepeatBinaryConversion {

    public static void main(String[] args) {
        String s = "110010101001";

        int[] answer = new int[2];

        while (!s.equals("1")) {
            int len = s.length();
            s=s.replaceAll("[^1]", "");
            answer[1] = answer[1] + (len - s.length());
            answer[0]++;
            s = Integer.toString(s.length(), 2);
        }
        System.out.println(answer[0]+" "+answer[1]);
    }
}
