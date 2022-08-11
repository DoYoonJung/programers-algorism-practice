package Pragrammers.Level2;
//멀쩡한 사각형
public class PlainSquare {

    public static void main(String[] args) {

        int w = 8;
        int h = 12;

        long answer = 0;
        for(int i = 0; i < w; i++)
            answer += (Long.valueOf(h) * i) / Long.valueOf(w);

        System.out.println( answer * 2);
    }
}
