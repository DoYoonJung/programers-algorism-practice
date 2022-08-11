package Pragrammers.Level2;

import java.util.PriorityQueue;

//더 맵게
public class MoreSpicy {

    public static void main(String[] args) {
        int[] scoville={1, 2, 3, 9, 10, 12};
        int K=7;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        int count = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            if(first>=K)break;

            int second = pq.poll()*2;


            pq.add(first + second);
            count++;
            if(pq.size()==1){
                count=-1;
                break;
            }

        }

        System.out.println(count);
    }
}
