class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //step 1 : to push opening braces
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;//it mean str has only closing braces no need to do more
                }
                //step when pair forming with st top
                if (st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']') {
                    st.pop();//to check another pair of o.p i.e stacktop and ch i.e next c.b    
                } else {
                    return false; // when no pair form 
                }

            }

        }
//for rem o.b 
        if (st.isEmpty()) {//if stack become empty it mean all pair found
            return true;

        } else {
            return false;
        }
    }
}