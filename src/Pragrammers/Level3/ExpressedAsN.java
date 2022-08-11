package Pragrammers.Level3;

import java.util.HashMap;
import java.util.Set;

//n 으로 표현
public class ExpressedAsN {
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int N=5;
        int number = 12;

        getReturn(0, N, number,0);

        System.out.println(result);
    }

    private static void getReturn(int cnt, int n, int target,int price) {
        if (cnt > 8) {
            return;
        }

        if(price==target){
            result = Math.min(cnt, result);
            return;
        }

        int count = 0;
        for (int i = 0; i < 8; i++) {
            count = count * 10 + n;
            getReturn(cnt+i+1,n,target,price+count);
            getReturn(cnt+i+1,n,target,price-count);
            getReturn(cnt+i+1,n,target,price/count);
            getReturn(cnt+i+1,n,target,price*count);
        }
    }
}
