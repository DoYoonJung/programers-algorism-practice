package Pragrammers.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//메뉴 리뉴얼
public class MenuRenewal {
    static HashMap<String, Integer> map;
    static int maxCount = 0;
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
             map = new HashMap<>();
            maxCount = 0;
            for (int j = 0; j < orders.length; j++) {
                if(course[i]>orders[j].length())continue;

                getReturn(0, course[i], 0, orders[j], "");
            }

            for (String key : map.keySet()) {
                if(map.get(key)==maxCount) list.add(key);
            }
        }
        Collections.sort(list);
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.println(result[i]);
        }



    }

    private static void getReturn(int inx, int course, int cnt, String order, String s) {
        if (cnt >= course) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);

            map.put(word, map.getOrDefault(word, 0) + 1);
            if(map.get(word)>maxCount) maxCount = map.get(word);
            return;
        }

        for (int i = inx; i < order.length(); i++) {
            getReturn(i+1,course,cnt+1,order,s+order.charAt(i));
        }
    }
}
