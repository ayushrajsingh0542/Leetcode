// Last updated: 15/08/2026, 20:02:37
class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length())
            return "0";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // Remove any remaining k digits
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        // Build string in correct order
        StringBuilder temp = new StringBuilder();
        while (!st.isEmpty()) {
            temp.insert(0, st.pop());
        }

        // Remove leading zeros using a flag and build final result
        boolean flag = false;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch == '0' && !flag)
                continue;
            if (ch != '0')
                flag = true;
            ans.append(ch);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
