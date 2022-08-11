package Pragrammers.Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//기능개발
public class FunctionDevelopment {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < speeds.length; i++) {
            int num = 100 - progresses[i];

            if (num % speeds[i] == 0) {
                q.add(num / speeds[i]);
            }else{
                q.add(num / speeds[i] + 1);
            }
        }
        int number = q.peek();
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int check = q.peek();
            System.out.println(check);
            if (check > number) {
                number = check;
                list.add(count);
                count = 0;
                continue;
            }
            q.poll();
            count++;
        }

        if(count!=0) list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }




    }
}
