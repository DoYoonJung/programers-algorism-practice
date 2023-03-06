package Pragrammers.Level2;
//최댓값과 최솟값
import java.util.Arrays;

public class MaxAndMinValues {

    public static void main(String[] args) {
        String s = "1 2 3 4";

        String[] temp = s.split(" ");
        int[] arr = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);

        String answer = arr[0]+" "+arr[arr.length-1];

        System.out.println(answer);


    }
}
