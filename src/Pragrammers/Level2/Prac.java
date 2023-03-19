package Pragrammers.Level2;

import java.util.*;

public class Prac {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(getReturn(5));
    }

    public static int getReturn(int a) {
        if(a==0) return 0;
        else if(a==1) return 1;
        else{
            return getReturn(a - 1) + getReturn(a - 2);
        }

    }
}
