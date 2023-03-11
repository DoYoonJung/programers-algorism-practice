package Pragrammers.Level2;

//문자열 압축
public class StringCompression {

    public static void main(String[] args) {


        String s = "abcabcabcabcdededededede";

        int minCount = 1234;
        for (int i = 0; i < s.length() / 2 + 1; i++) {
           String answer = getReturn(s, 1,i+1);
            minCount = Math.min(minCount, answer.length());
        }

        System.out.println(minCount);

    }

    private static String getReturn(String s,int count,int price) {

        if (s.length() < price) {
            return s;
        }

        String result = "";

        String first = s.substring(0,price);
        String second = s.substring(price);

        if (second.startsWith(first)) {
            result+=getReturn(second,count+1,price);
        }else{
            if (count < 2) {
                result += first + getReturn(second, 1, price);
            }else{
                result += count +first+ getReturn(second, 1, price);
            }
        }

        return result;
    }
}
