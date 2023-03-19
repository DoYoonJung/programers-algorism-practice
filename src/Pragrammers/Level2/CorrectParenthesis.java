package Pragrammers.Level2;

import java.util.Stack;

public class CorrectParenthesis {

    public static void main(String[] args) {
        String s = "()()";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            if(st.isEmpty()) st.add(word);
            else{
                switch (word) {
                    case ')' :
                        if (st.peek()=='(') {
                            st.pop();
                        }
                        break;
                    default:
                        st.add(word);
                        break;
                }
            }
        }

        if(st.isEmpty()) System.out.println(true);
        else System.out.println(false);
    }
}
