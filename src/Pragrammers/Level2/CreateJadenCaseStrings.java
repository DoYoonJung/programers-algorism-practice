package Pragrammers.Level2;

import java.util.Locale;

//JadenCase 문자열 만들기
public class CreateJadenCaseStrings {

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        s = s.toLowerCase();

        String temp[] =s.split(" ");
        String answer = "";
        for (int i = 0; i < temp.length; i++) {
            answer += temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1);
            if(i!= temp.length-1) answer += " ";
        }
        System.out.println(answer);
    }
}
