package Pragrammers.Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//두 큐 합 같게 만들기
public class MakeTwoQSumEqual {

    public static void main(String[] args) {
        int[] queue1 = {1, 2, 1, 2};
        int[] queue2 = {1, 10, 1, 2};

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        long sumQ1 = Arrays.stream(queue1).sum();
        long sumQ2 = Arrays.stream(queue2).sum();

        long target = (sumQ1 + sumQ2) / 2;
        int count = 0;
        while (sumQ1 != target || sumQ2 != target) {
            if (sumQ1 < target) {
                q1.add(q2.peek());
                sumQ1 += q2.peek();
                sumQ2 -= q2.peek();
                q2.poll();
            } else if (sumQ2 < target) {
                q2.add(q1.peek());
                sumQ2 += q1.peek();
                sumQ1 -= q1.peek();
                q1.poll();
            }
            count++;
            if(count>queue1.length*3){
                System.out.println(-1);
                break;
            }
        }

        System.out.println(count);
    }
}
