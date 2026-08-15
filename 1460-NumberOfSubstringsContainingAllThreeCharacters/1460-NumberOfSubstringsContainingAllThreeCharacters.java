// Last updated: 15/08/2026, 19:55:17
class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {
                count += s.length() - r;
                char ch2 = s.charAt(l);
                map.put(ch2, map.get(ch2) - 1);
                if (map.get(ch2) == 0)
                    map.remove(ch2);
                l++;
            }
            r++;
        }

        return count;
    }
}
