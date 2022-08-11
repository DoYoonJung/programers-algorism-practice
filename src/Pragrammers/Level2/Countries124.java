package Pragrammers.Level2;
//124나라의 숫자
public class Countries124 {

    public static void main(String[] args) {
        int n = 10;

        char[] arr = {'4', '1', '2'};
        String result = "";

        while (n > 0) {
            int remain = n % 3;
            n = n / 3;
            if(remain==0) n--;
            result = arr[remain] + result;
        }

        System.out.println(result);
    }
}
