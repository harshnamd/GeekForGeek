class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.add(ch);
            } 
            else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((top == '(' && ch == ')') || 
                    (top == '{' && ch == '}') || 
                    (top == '[' && ch == ']')) {
                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
