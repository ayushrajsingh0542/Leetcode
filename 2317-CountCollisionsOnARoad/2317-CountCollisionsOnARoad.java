// Last updated: 15/08/2026, 19:52:04
class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < directions.length(); i++) {
            char curr = directions.charAt(i);

            if (curr == 'R') {
                st.push('R');
            } else if (curr == 'S') {
                while (!st.isEmpty() && st.peek() == 'R') {
                    ans += 1;
                    st.pop();
                }
                st.push('S');
            } else { 
                if (st.isEmpty()) {
                    st.push('L');
                } else if (st.peek() == 'R') {
                    ans += 2;
                    st.pop();

                    while (!st.isEmpty() && st.peek() == 'R') {
                        ans += 1;
                        st.pop();
                    }
                    st.push('S');
                } else if (st.peek() == 'S') {
                    ans += 1;
                    st.push('S');
                } else {
                    st.push('L');
                }
            }
        }

        return ans;
    }
}