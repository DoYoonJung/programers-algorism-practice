package Pragrammers.Level3;

import java.util.Collections;
import java.util.PriorityQueue;

//야근 지수(답이 12가 나와야 되는데 8이 나옴)
public class OvertimeIndex {

    public static void main(String[] args) {
        int n=4;
        int[] works = {4,3,3};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }

        for (int i = 0; i < n; i++) {
            int price = pq.poll()-1;

            pq.add(price);
        }
        int answer = 0;
        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            if (pq.peek() > 0) {
                answer += Math.pow(pq.poll(), 2);
            }
            pq.poll();
        }
        System.out.println(answer);


    }
}
