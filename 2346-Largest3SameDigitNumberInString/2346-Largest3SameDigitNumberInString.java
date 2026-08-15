// Last updated: 15/08/2026, 19:51:56
class Solution {
    public String largestGoodInteger(String num) {
        int len = 1;
        char ch = num.charAt(0);
        StringBuilder temp = new StringBuilder();
        temp.append(ch);

        int max = Integer.MIN_VALUE;
        String ans = "";

        for (int i = 1; i < num.length(); i++) {
            if (len == 3) {
                len = 0;
                int nums = Integer.parseInt(temp.toString());
                if (nums > max) {
                    max = nums;
                    ans = temp.toString();
                }
                temp.setLength(0); // reset StringBuilder
            }

            char ch2 = num.charAt(i);
            if (ch2 == ch) {
                ch = ch2;
                temp.append(ch2);
                len++;
            } else {
                temp.setLength(0);
                temp.append(ch2);
                len = 1;
                ch = ch2;
            }
        }

        if (ans.isEmpty() && len != 3)
            return "";
        if ((ans.isEmpty() && len == 3) || 
            (temp.length() == 3 && Integer.parseInt(temp.toString()) > Integer.parseInt(ans))) {
            ans = temp.toString();
        }

        return ans;
    }
}
