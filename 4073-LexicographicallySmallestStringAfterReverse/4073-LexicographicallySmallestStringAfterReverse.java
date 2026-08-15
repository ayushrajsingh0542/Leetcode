// Last updated: 15/08/2026, 19:48:23
class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String ans = s;

        for (int k = 2; k <= n; k++) {
            StringBuilder sb1 = new StringBuilder(s.substring(0, k));
            sb1.reverse().append(s.substring(k));
            String res1 = sb1.toString();

            StringBuilder sb2 = new StringBuilder(s.substring(n - k));
            sb2.reverse().insert(0, s.substring(0, n - k));
            String res2 = sb2.toString();

            if (res1.compareTo(ans) < 0) ans = res1;
            if (res2.compareTo(ans) < 0) ans = res2;
        }

        return ans;
    }
}
