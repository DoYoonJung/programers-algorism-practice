package Pragrammers.Level2;

import java.util.Stack;

//올바른 괄호
public class CorrectParentheses {

    public static void main(String[] args) {
        String s = "(())()";
        Stack<Character> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(st.isEmpty()) st.add(a);
            else{
                switch (a){
                    case')':
                        if(st.peek()=='(') {
                            st.pop();
                        }
                        break;
                    default:
                        st.add(a);
                        break;
                }

            }

        }

        if (st.isEmpty()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
