// Last updated: 15/08/2026, 19:49:19
import java.util.*;

class Solution {
    public int minDeletion(String s, int k) {
        int al[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int num = ch - 'a';
            al[num]++;
        }

        Arrays.sort(al);
        int d = 0;

        for (int i = 0; i < al.length; i++) {
            if (al[i] != 0)
                d++;
        }

        if (k >= d)
            return 0;

        int ans = 0;
        int j = 0;
        int remove = d - k;

        while (remove > 0 && j < al.length) {
            if (al[j] != 0) {
                ans += al[j];
                remove--;
            }
            j++;
        }

        return ans;
    }
}
