package Pragrammers.Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//주차 요금 계산
public class ParkingFeeCalculation {

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String temp[] = records[i].split(" ");
            String arr[] = temp[0].split(":");

            int time = 1439 - (Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]));

            if (temp[2].equals("IN")) {
                if (map.containsKey(Integer.parseInt(temp[1]))) {
                    map.put(Integer.parseInt(temp[1]), map.get(Integer.parseInt(temp[1])) + time);
                }else{
                    map.put(Integer.parseInt(temp[1]), time);
                }
            }else{
                map.put(Integer.parseInt(temp[1]), map.get(Integer.parseInt(temp[1])) - time);
            }
        }

        int[] answer = new int[map.size()];

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((s1, s2) -> s1 - s2);
        int count = 0;

        for (int s : list) {
            if (map.get(s) - fees[0] <= 0) {
                answer[count] = fees[1];
            }else{
                answer[count] = fees[1] + (int)Math.ceil((double) (map.get(s) - fees[0]) / (double) fees[2]) * fees[3];
            }
            count++;
        }

    }
}
