package Pragrammers.Level2;

import java.util.Stack;

//짝지어 제거하기
public class PairToRemove {

    public static void main(String[] args) {
        String s = "baabaa";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(st.isEmpty()){
                st.add(s.charAt(i));
                continue;
            }
            if (st.peek() == s.charAt(i)) {
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }

        if(st.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }
}
