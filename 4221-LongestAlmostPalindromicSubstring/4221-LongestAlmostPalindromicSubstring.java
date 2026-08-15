// Last updated: 15/08/2026, 19:47:13
class Solution {
    public int almostPalindromic(String s) {

        int n = s.length();
        int max = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int len = j - i + 1;
                if (len <= max) 
                    continue;

                if (almostPal(a, i, j)) {
                    max = len;
                }
            }
        }
        return max;
    }

    boolean almostPal(char[] a, int l, int r) {

        int i = l, j = r;

        while (i < j) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else {
                return isPal(a, i + 1, j) || isPal(a, i, j - 1);
            }
        }

        
        for (int k = l; k <= r; k++) {
            if (isPalAfterRemove(a, l, r, k)) 
                return true;
        }

        return false;
    }

    boolean isPalAfterRemove(char[] a, int l, int r, int skip) {
        while (l < r) {
            if (l == skip) l++;
            else if (r == skip) r--;
            else if (a[l++] != a[r--])
                return false;
        }
        return true;
    }

    boolean isPal(char[] a, int l, int r) {
        while (l < r) {
            if (a[l++] != a[r--])
                return false;
        }
        return true;
    }
}
