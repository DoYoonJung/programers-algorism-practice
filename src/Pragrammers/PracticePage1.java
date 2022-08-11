package Pragrammers;

import java.util.HashSet;
import java.util.Set;

public class PracticePage1 {

    public static void main(String[] args) {
        int N=2;
        int number = 11;
        int t = N;
        Set<Integer>[] arr = new Set[9];

        for (int i = 1; i < 9; i++) {
            arr[i] = new HashSet<>();

            arr[i].add(t);
            t = t * 10 + N;
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer a : arr[j]) {
                    for (Integer b : arr[i - j]) {
                        arr[i].add(a + b);
                        arr[i].add(a - b);
                        arr[i].add(a * b);
                        if (b != 0) {
                            arr[i].add(a / b);
                        }
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 1; i < 9; i++) {
            if (arr[i].contains(number)) {
                answer=i;
                break;
            }
        }

        System.out.println(answer);




    }
}
