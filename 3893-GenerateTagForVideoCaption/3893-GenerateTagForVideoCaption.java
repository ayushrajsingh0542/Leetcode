// Last updated: 15/08/2026, 19:49:08
class Solution {
    public String generateTag(String caption) {
        StringBuilder ans = new StringBuilder("#");
        char[] arr = caption.toCharArray();
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == ' ') {
                // Only set check = true if something is already added
                if (ans.length() > 1) {
                    check = true;
                }
            } else if (Character.isLetter(ch)) {
                if (ans.length() == 1) { 
                    ans.append(Character.toLowerCase(ch));
                    check = false; // reset check after first letter
                } else if (check) {
                    ans.append(Character.toUpperCase(ch));
                    check = false;
                } else {
                    ans.append(Character.toLowerCase(ch));
                }
            }

            if (ans.length() == 100) break;
        }

        return ans.toString();
    }
}
