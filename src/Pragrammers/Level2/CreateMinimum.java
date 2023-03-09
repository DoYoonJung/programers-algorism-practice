package Pragrammers.Level2;

import java.util.Arrays;

//최솟값 만들기
public class CreateMinimum {

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }

        System.out.println(answer);

    }
}
