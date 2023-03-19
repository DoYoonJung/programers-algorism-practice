package Pragrammers.Level2;

import javax.swing.*;

//양궁 대회
public class ArcheryCompetition {
    static int result = 0;
    static int[] answer = new int[11];
    public static void main(String[] args) {
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};

        getReturn(n, info, 0,0,0,new int[11]);

        for (int i = 0; i <= 10; i++) {
            System.out.print(answer[i]+" ");
        }
    }

    private static void getReturn(int n, int[] info, int cnt,int appach, int lion,int[] arr) {
        if (cnt >= 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            if (lion - appach >= result) {
                arr[cnt] = n;
                if (lion - appach > result) {
                    sum(arr);
                    result = lion - appach;
                } else if (lion - appach == result) {
                    if (isCheck(arr)) {
                        sum(arr);
                    }
                }
            }
            return;
        }

        if (n > info[cnt]) {
            arr[cnt] = info[cnt] + 1;
            getReturn(n-(info[cnt] + 1),info,cnt+1,appach,lion+(10-cnt),arr);
        }
        arr[cnt]=0;
        getReturn(n, info, cnt + 1, appach + (info[cnt] == 0 ? 0 : (10 - cnt)), lion, arr);
        return;
    }

    private static void sum(int[] arr) {
        for (int i = 0; i < 10; i++) {
            answer[i] = arr[i];
        }
    }
    private static boolean isCheck(int[] arr) {
        for (int i = 10; i >= 0; i--) {
            if (arr[i] > answer[i]) {
                return true;
            }
        }
        return false;
    }
}
