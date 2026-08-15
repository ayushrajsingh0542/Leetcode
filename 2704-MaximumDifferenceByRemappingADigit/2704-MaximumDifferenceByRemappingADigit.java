// Last updated: 15/08/2026, 19:51:11
class Solution {
    private int createHigh(String s) {
        char mp1 = '#';
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9' && mp1 == '#') {
                mp1 = s.charAt(i);
            }

            if (s.charAt(i) == mp1) {
                tmp.append('9');
            } else {
                tmp.append(s.charAt(i));
            }
        }

        return Integer.parseInt(tmp.toString());
    }

    private int createLow(String s) {
        char mp1 = '#';
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (mp1 == '#') {
                mp1 = s.charAt(i);
            }

            if (s.charAt(i) == mp1) {
                tmp.append('0');
            } else {
                tmp.append(s.charAt(i));
            }
        }

        return Integer.parseInt(tmp.toString());
    }

    public int minMaxDifference(int num) {
        String s = Integer.toString(num);

        int highNum = createHigh(s);
        int lowNum = createLow(s);

        return highNum - lowNum;
    }
}