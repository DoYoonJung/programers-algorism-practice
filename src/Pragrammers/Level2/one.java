package Pragrammers.Level2;

import java.util.HashMap;

public class one {

    public static void main(String[] args) {
        String s = "axxaxa";

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int answer = 0;
        for (char a : map.keySet()) {
            if(map.get(a)%2==1) answer++;
        }
        System.out.println(answer);
    }
}
