// Last updated: 15/08/2026, 19:58:29
public class Solution {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '(' && x == ')') {
                stack.pop();
            } else {
                stack.push(x);
            }
        }
        return stack.size();
    }

    
}