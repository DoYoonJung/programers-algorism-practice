package Pragrammers.Level3;

import java.util.ArrayList;

//가장 먼 노드
public class FarthestNode {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static int[] table;
    static boolean[] visit;

    public static void main(String[] args) {

        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < edge.length; i++) {
            list.get(edge[i][0]).add(edge[i][1]);
            list.get(edge[i][1]).add(edge[i][0]);
        }

        table = new int[n + 1];
        visit = new boolean[n + 1];
        int result = -1;

        for (int i = 1; i < n + 1; i++) {
            table[i] = 987987;
        }
        table[1] = 0;

        for (int i = 1; i <= n; i++) {
            int minValue = 987985;
            int minIndex = -1;
            for (int j = 1; j < n + 1; j++) {
                if (!visit[j] && table[j] < minValue) {
                    minValue = table[j];
                    minIndex = j;
                }
            }

            visit[minIndex] = true;

            for (int j = 0; j < list.get(minIndex).size(); j++) {
                int node = list.get(minIndex).get(j);
                int cost = 1;

                if (table[node] > table[minIndex] + cost) {
                    table[node] = table[minIndex] + cost;
                    result = Math.max(result, table[node]);
                }
            }
        }

        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (table[i] == result) {
                answer++;
            }
        }

        System.out.println(answer);


    }
}
