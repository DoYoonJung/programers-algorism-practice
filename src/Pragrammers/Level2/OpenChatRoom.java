package Pragrammers.Level2;

import java.util.HashMap;

//오픈채팅방
public class OpenChatRoom {
    static HashMap<String, String> map = new HashMap<>();
    static HashMap<String, String> behavior = new HashMap<>();
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo","Leave uid1234",
                "Enter uid1234 Prodo","Change uid4567 Ryan"};

        behavior.put("Enter", "님이 들어왔습니다.");
        behavior.put("Leave", "님이 나갔습니다.");

        int count = 0;

        for (int i = 0; i < record.length; i++) {
            String temp[] = record[i].split(" ");

            if (temp[0].equals("Enter") || temp[0].equals("Change")) {
                map.put(temp[1], temp[2]);
            }

            if (temp[0].equals("Enter") || temp[0].equals("Leave")) {
                count++;
            }
        }

        String[] result = new String[count];
        int num = 0;
        for (int i = 0; i < record.length; i++) {
            String temp[] = record[i].split(" ");

            if (temp[0].equals("Enter")|| temp[0].equals("Leave")) {
                result[num] =map.get(temp[1])+behavior.get(temp[0]);
                num++;
            }
        }


        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
