// Last updated: 15/08/2026, 19:56:13
class Solution {
    public static String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        
        while (a > 0 || b > 0 || c > 0) {
            // Check the most frequently available character that can be added
            if (a >= b && a >= c) {
                // Add 'a' if we can (up to 2 times)
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'a' && sb.charAt(sb.length() - 2) == 'a') {
                    // If the last two characters are 'a', add the next character
                    if (b > 0) {
                        sb.append('b');
                        b--;
                    } else if (c > 0) {
                        sb.append('c');
                        c--;
                    } else {
                        break; // No more characters to add
                    }
                } else {
                    sb.append('a');
                    a--;
                }
            } else if (b >= a && b >= c) {
                // Add 'b' if we can
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'b' && sb.charAt(sb.length() - 2) == 'b') {
                    if (a > 0) {
                        sb.append('a');
                        a--;
                    } else if (c > 0) {
                        sb.append('c');
                        c--;
                    } else {
                        break;
                    }
                } else {
                    sb.append('b');
                    b--;
                }
            } else {
                // Add 'c' if we can
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'c' && sb.charAt(sb.length() - 2) == 'c') {
                    if (a > 0) {
                        sb.append('a');
                        a--;
                    } else if (b > 0) {
                        sb.append('b');
                        b--;
                    } else {
                        break;
                    }
                } else {
                    sb.append('c');
                    c--;
                }
            }
        }

        return sb.toString();
    }
}