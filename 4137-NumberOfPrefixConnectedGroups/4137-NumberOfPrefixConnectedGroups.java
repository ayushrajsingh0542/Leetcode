// Last updated: 15/08/2026, 19:47:59
import java.util.*;

class Solution {
    public int prefixConnected(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (w.length() < k) continue;

            String prefix = w.substring(0, k);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        int groups = 0;

        for (int count : map.values()) {
            if (count >= 2) groups++;
        }

        return groups;
    }
}
