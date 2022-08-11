package Pragrammers.Level3;

import java.util.Arrays;

//입국 심사
public class Immigration {

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        Arrays.sort(times);

        long start = 0;
        long end = Long.valueOf(n) * Long.valueOf(times[times.length - 1]);
        long answer = 0;


        while (start < end) {
            long mid = (start + end) / 2;
            long count=0;
            for (int i = 0; i < times.length; i++) {
                count += mid / times[i];
            }

            if (count > n) {
                end = mid-1;
            }else{
                start = mid + 1;
                answer = mid;

            }
            System.out.println(start+" "+end+" " +answer);
        }
        System.out.println(answer);
    }
}
