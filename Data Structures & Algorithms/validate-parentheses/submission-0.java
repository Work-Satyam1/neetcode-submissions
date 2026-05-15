class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray())
        {
            // opening brackets
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else
            {
                // if stack empty
                if(st.isEmpty()) return false;

                char top = st.pop();

                // matching check
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '['))
                {
                    return false;
                }
            }
        }

        // stack should be empty
        return st.isEmpty();
    }
}
