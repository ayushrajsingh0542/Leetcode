// Last updated: 15/08/2026, 19:47:37
class Solution {
    public String largestEven(String s) {

        String ans = "";
        char last = s.charAt(s.length() - 1);
        if (last == '2')
            return s;

        boolean flag2 = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                flag2 = true;
                ans = s.substring(0, i + 1);
                break;
            }
        }

        if (!flag2)
            return "";

        return ans;
    }
}
 