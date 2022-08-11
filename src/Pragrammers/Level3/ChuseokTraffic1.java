package Pragrammers.Level3;
//[1차]추석 트레픽
public class ChuseokTraffic1 {

    public static void main(String[] args) {
        String[] lines = {"2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"};

        int[] answer = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String temp[] = lines[i].split(" ");

            String first = temp[1].replaceAll(":", "");
            String second = temp[2].replaceAll("s", "");

            int time = Integer.parseInt(first.substring(0,2))*3600+Integer.parseInt(
                    first.substring(2,4))*60+Integer.parseInt(first.substring(4,6));

            lines[i] = time + "" + first.substring(6) + " " + second;
        }

        for (int i = 0; i < lines.length; i++) {
            String[] target = lines[i].split(" ");
            double total = Double.parseDouble(target[0]) + 1;

            for (int j = i; j < lines.length; j++) {
                String[] arr = lines[j].split(" ");
                double start = Double.parseDouble(arr[0]) - Double.parseDouble(arr[1]) + 0.001;

                if (total > start) {
                    answer[i]++;
                }
            }

        }
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] > count) {
                count = answer[i];
            }
        }

        System.out.println(count);

    }
}
