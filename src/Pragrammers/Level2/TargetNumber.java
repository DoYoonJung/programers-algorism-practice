package Pragrammers.Level2;
//타겟 넘버
public class TargetNumber {
    static int count=0;
    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        getReturn(0, target, numbers,0);

        System.out.println(count);
    }

    private static void getReturn(int cnt, int target, int[] numbers, int sum) {
        if (cnt >= numbers.length) {
            if(target==sum) count++;
            return;
        }

        getReturn(cnt+1,target,numbers,sum+numbers[cnt]);
        getReturn(cnt+1,target,numbers,sum-numbers[cnt]);

    }
}
