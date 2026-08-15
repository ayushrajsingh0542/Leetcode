// Last updated: 15/08/2026, 19:49:52
import java.util.*;


class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

       
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if (first != second && 
                map.get(first) == Character.getNumericValue(first) &&
                map.get(second) == Character.getNumericValue(second)) {
                return "" + first + second;
            }
        }

        return "";
    }

   
}
