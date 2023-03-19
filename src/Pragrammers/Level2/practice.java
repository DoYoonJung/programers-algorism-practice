package Pragrammers.Level2;

import java.util.Stack;

public class practice {


    public static void main(String[] args) {
        String str = "()(())";
        Stack<Integer> s = new Stack<>();
        s.add(-1);
        int answer = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(') s.add(i);
            else{
                s.pop();
                if(s.empty()){
                    s.add(i);
                    continue;
                }
                int idx = s.peek();
                answer = Math.max(answer,i-idx);
            }
        }
        System.out.println(answer);
    }
}
