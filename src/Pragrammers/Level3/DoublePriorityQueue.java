package Pragrammers.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//이중 우선순위 큐
public class DoublePriorityQueue {

    public static void main(String[] args) {
        String[] operations = {"I -45", "I 653", "D 1", "I -642",
                "I 45", "I 97", "D 1", "D -1", "I 333"};
        int answer[] = new int[2];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < operations.length; i++) {
            String[] words = operations[i].split(" ");
            if (words[0].equals("I")) {
                int price = Integer.parseInt(words[1]);
                map.put(price, map.getOrDefault(price, 0) + 1);
            }else if(!map.isEmpty()&&words[0].equals("D")){

                if (words[1].equals("-1")) {
                    if (map.get(map.firstKey()) >= 2) {
                        map.put(map.firstKey(), map.get(map.firstKey()) - 1);
                    }else{
                        map.remove(map.firstKey());
                    }
                }else{
                    if (map.get(map.lastKey()) >= 2) {
                        map.put(map.lastKey(), map.get(map.lastKey()) - 1);
                    }else{
                        map.remove(map.lastKey());
                    }
                }
            }
        }

        if (!map.isEmpty()) {
            answer[1] = map.firstKey();
            answer[0] = map.lastKey();
        }

        System.out.println(answer[0]+" "+answer[1]);


    }
}
